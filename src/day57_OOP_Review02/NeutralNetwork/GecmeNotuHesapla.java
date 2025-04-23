package day57_OOP_Review02.NeutralNetwork;

import java.util.Scanner;

public class GecmeNotuHesapla {

    private final double[] weights; //Ağırlık kat sayıları
    private double bias; //Ek ağırlık katsayısı
    private final double learningRate; //tuning, öğrenmenin hızı, öğrenmenin kalitesi

    public GecmeNotuHesapla(int numInputs, double learningRate) {
        weights = new double[numInputs]; //Herbir input için bir weight
        this.learningRate = learningRate;
        initializeWeights();
        bias = Math.random();
    }

    //Öğrenme işleminde kullanılacak ağırlıklar için başlangıç olarak rastgele ağırlıklar oluşturur
    private void initializeWeights() {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random();
        }
    }

    /**
     * predict() metodu, giriş değerlerinin ve karşılık gelen ağırlıkların ağırlıklı toplamını hesaplar
     * ve ardından ek düzeltme(bias) değerini ekler.
     * Sonuç olarak, nihai ağırlıklı toplamı döndürür.
     * @param inputs
     * @return
     */
    public double predict(double[] inputs) {
        double weightedSum = 0.0;
        for (int i = 0; i < inputs.length; i++) {
            weightedSum += weights[i] * inputs[i];
        }
        weightedSum += bias;
        return weightedSum;
    }

    /**
     * train() metodu, tahmin edilen çıktı ile gerçek çıktı arasındaki hataya dayalı olarak ağırlıkları ve sapmayı ayarlayarak
     * bir perceptron(algılayıcı) modelini eğitmek için kullanılır.
     * Öğrenme oranı ve hata verilerine dayanarak ağırlık kat sayılarını(weghts) ve sapma/ek ağırlık(bias) kat sayısnı
     * parametre olarak gönderilen numEpochs(öğrenme tekrar sayısı) sayısı kadar tekrar ederek ağırlıklardaki gerekli güncellemeleri yapar
     * @param inputs - İki boyutlu bir dizi. Herbir elemanı Vize1, Vize2 ve Final notunu içerir
     * @param output - Tek boyutlu bir dizi. Herbir elemanı Vize1, Vize2 ve Final notuna göre hesaplanmış geçme notu bilgisini içerir
     * @param numEpochs - Öğrenme tekrar sayısı
     */
    public void train(double[][] inputs, double[] output, int numEpochs) {
        for (int epoch = 0; epoch < numEpochs; epoch++) {
            for (int i = 0; i < inputs.length; i++) {
                double prediction = predict(inputs[i]);
                double error = output[i] - prediction;
                for (int j = 0; j < weights.length; j++) {
                    weights[j] += learningRate * error * inputs[i][j];
                }
                bias += learningRate * error;
                if (epoch % 100 == 0) {
                    System.out.printf("Number of training: %-5d Weight[0]: %.10f Weight[1]: %.10f Weight[2]: %.10f Bias: %.10f Error: %.15f", epoch, weights[0], weights[1], weights[2], bias, error);
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner notGir = new Scanner(System.in);

        // Example usage
        GecmeNotuHesapla perceptron = new GecmeNotuHesapla(3, 0.00001);
        /*
            gecmeNotu = (vize1 * 0.20) + (vize2 * 0.20) + (final * 60) + bias
            weigthedSum = w1 * input1 + w2 * input2 + w3 * input3 + bias
            y = w1 * vize1 + w2 * vize2 + w3 * final + bias

            Multiple inputs---vize1 vize2 final

         */
        // inputs : 2 boyutlu bir dizi.
        // Dizinin her elamanı Vize1, Vize2 ve Final notlarını içerir
        double[][] inputs = {{100.0, 100.0, 100.0}, {100.0, 80.0, 50.0}, {80.0, 100.0, 60.0}, {40.0, 60.0, 20.0}, {70.0, 50.0, 80.0}, {50.0, 90.0, 30.0}};

        // Output values--Sınıf geçme notlarını içerir.
        double[] output = {400.0, 330.0, 320.0, 160.0, 270.0, 220.0};

        //Yapay sinirin (perceptron) eğitim/öğrenmesi için inputs:notlar ve bu notlara karşılık hesaplanmış geçme notları parametre olarak metoda gönderirlir
        //Ayrıca öğrenme işleminin ne kadar tekrarda gerçekleşeceğine ilişkin Epochs parametresi de metoda gönderilir
        perceptron.train(inputs, output, 500_000);

        System.out.println();
        System.out.println("-------- Training process is finished ---------");

        double[] testInput = new double[3];

        // öğrenme(perceptron.train) işlemi sonrası belirlenen katsayılar konsola yazdırılır
        System.out.printf("Weight[0]: %.10f %n", perceptron.weights[0]); //Birinci(Vize1) input için öğrenme sonucu katsayısı
        System.out.printf("Weight[1]: %.10f %n", perceptron.weights[1]); //İkinci(Vize2) input için öğrenme sonucu katsayısı
        System.out.printf("Weight[2]: %.10f %n", perceptron.weights[2]); //Üçüncü(Final) input için öğrenme sonucu katsayısı
        System.out.printf("Bias     : %.10f %n", perceptron.bias); //Ek ağırlık katsayısı

        System.out.println();
        //Öğrenme işlemini test etmek için test girdileriyle hesaplama kontrol edilir
        System.out.println("Hesaplamak istediğiniz Vize1, Vize2 ve Final notunu giriniz.");
        System.out.print("1.Vize notu : ");
        testInput[0] = notGir.nextDouble();

        System.out.print("2.Vize notu : ");
        testInput[1] = notGir.nextDouble();

        System.out.print("Final notu  : ");
        testInput[2] = notGir.nextDouble();

        // Test prediction
        // double[] testInput = {10.0, 100.0, 10.0};
        double prediction = perceptron.predict(testInput);

        System.out.printf("Tahmin edilen sınıf geçme notu: %.2f %n", prediction);
    }
}
