package learning;

import java.util.Date;

public class CloneExample
{
    public static void main(String[] args)
    {
        try
        {
            CloneExampleSample obj = new CloneExampleSample();
            System.out.println("Original: " + obj.hashCode() + " D:" + obj.getD() + " Date Hash:" + obj.getD().hashCode());
            obj = (CloneExampleSample) obj.clone();
            System.out.println("Cloned: " + obj.hashCode() + " D:" + obj.getD() + " Date Hash:" + obj.getD().hashCode());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}

class CloneExampleSample implements Cloneable
{

    private Date d;

    public CloneExampleSample()
    {
        d = new Date();
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("CloneExampleSample.clone()");
        CloneExampleSample obj = (CloneExampleSample) super.clone();
        obj.d = new Date(d.getTime());
        return obj;
    }

    public Date getD()
    {
        return d;
    }

}