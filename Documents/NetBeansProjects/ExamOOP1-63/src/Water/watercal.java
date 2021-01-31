package Water;
import java.util.ArrayList;
import java.util.Scanner;

public class watercal{
    public static void main(String[] args) {
    int siz;
    char loopstop = 'n';
    double utemp,nettemp = 0,nettot = 0;
    ArrayList<String> code = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Double> unit = new ArrayList<>();
    ArrayList<Double> net = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    
    System.out.printf("Enter Data");
    while(loopstop == 'n'){
        System.out.printf("\n\tCODE : ");
        code.add(inp.next());
        System.out.printf("\n\tName : ");
        name.add(inp.next());
        System.out.printf("\n\tUnit Used : ");
        utemp = inp.nextDouble();
        unit.add(utemp);
        if (1 <= utemp && utemp <= 20){
            nettemp = utemp * 2.5;
        }else if(utemp>20 && utemp<=50){
            nettemp = utemp * 3;
        }else if(utemp>50 && utemp<=100){
            nettemp = utemp * 3.5;
        }else if(utemp>100){
            nettemp = utemp * 4;
        }
        net.add(nettemp);
        nettot = nettot + nettemp;
        System.out.printf("\nDo you want to stop y/n ? ");
        loopstop = inp.next().charAt(0);
    }
    siz = code.size();

    System.out.println("\t\t\tREPORT WATER USED");
    System.out.println("===========================================================================");
    System.out.println("NO\tCODE\t\tNAME\t\tUNIT\t\tNETPAY");
    System.out.println("===========================================================================");
    for(int j=0;j<siz;j++){
        System.out.println((j+1)+"\t"+code.get(j)+"\t\t"+name.get(j)+"\t\t"+unit.get(j)+"\t\t"+net.get(j));
    }
    System.out.println("===========================================================================");
    System.out.println("TOTAL\t\t\t\t\t\t\t"+nettot);
    }
}
