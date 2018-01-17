package learning;

public class ErrorImpl extends Error 
{
    private static final long serialVersionUID = 1L;

    class ErrorTest
    {
        public void show() throws Exception 
        {
         throw new Exception();
        }
    }
}
