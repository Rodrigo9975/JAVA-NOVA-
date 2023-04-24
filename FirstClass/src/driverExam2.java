import java.util.ArrayList;

public class driverExam2 
{   //criaçao das duas principais arrays
    public char[] gabarito;
    public char[] respostas;
    
    // especifica o codigo driveexam2, o this serve para comparar os dois arrays
    public driverExam2(char[] correctanswers, char[] studentanswers)
    {
        this.gabarito = correctanswers;
        this.respostas = studentanswers;
    }
    // criar um boolean para saber se o usuario foi aprovado ou nao
    public boolean passed() 
    {
        int pass = totalcorrect();
        return pass >= 15;
    }
    //verificar as que o usuario acertou 
    public int totalcorrect() 
    {
        int correct = 0;
        for(int i = 0; i < gabarito.length; i++) 
        {
            if(gabarito[i] == respostas[i]) 
            {
                correct++;
            }
        }
        return correct;
    }
    
    public int totalincorrect() 
    {
        return respostas.length -totalcorrect();
    }
    
    public int[] questionsmissed() 
    {
        ArrayList< Integer> missed = new ArrayList<Integer>();
        for (int i = 0; i < gabarito.length; i++) 
        {
            if (gabarito[i] != respostas[i]) 
            {
            	missed.add(i+1);
            }
        }
        int[] missedArray = new int[missed.size()];
        for (int i = 0; i < missed.size(); i++) 
        {
            missedArray[i] = missed.get(i);
        }
        return missedArray;
    }
}




