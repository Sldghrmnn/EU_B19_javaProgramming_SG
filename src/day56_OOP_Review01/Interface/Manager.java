package day56_OOP_Review01.Interface;

public class Manager {

    private Tagabale tagabaleObj;

    public Manager(){

    }

    public Manager(Tagabale tagabaleObj){this.tagabaleObj = tagabaleObj;}

    public void select(){tagabaleObj.select(tagabaleObj);}
}
