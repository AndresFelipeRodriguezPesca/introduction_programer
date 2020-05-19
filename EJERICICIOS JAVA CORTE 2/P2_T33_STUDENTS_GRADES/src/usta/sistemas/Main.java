package usta.sistemas;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Felipe Rodriguez Pesca
	DATE:2020/05/12
	DESCRIPTION:
	 */
        f_menu();
        double[][] matrix_grades=f_fill_matrix();
        f_show_final_grades(matrix_grades);


    }
    public static void f_menu() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║   SoftGradeStudents      ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-12        ║");
        System.out.println("╚══════════════════════════╝");
    }
    public static double[][] f_fill_matrix(){
        //Description:This method returns the fill matrix(10*4)
        double[][] matrix= new double[10][4];
        for (int i=0; i<10;i++){
            matrix[i][0]=Math.floor((Math.random()*5)+1);
            matrix[i][1]=Math.floor((Math.random()*5)+1);
            matrix[i][2]=Math.floor((Math.random()*5)+1);
            matrix[i][3]=Math.floor((Math.random()*5)+1);
        }
        return matrix;

    }
    public static void f_show_final_grades(double[][]matrix_grades){
        //Description: This method show the final grades
       double final_grades=0;
        for (int i=0;i<10 ;i++){
            final_grades=matrix_grades[i][0]*0.2+
                    matrix_grades[i][0]*0.25+
                    matrix_grades[i][0]*0.25+
                    matrix_grades[i][0]*0.3;
            System.out.println(" Student ("+(i+1)+"), grade 1: "+matrix_grades[i][0]+", grade 2: "+ matrix_grades[i][1]+
           ", grade 3: "+matrix_grades[i][2]+", grade 4: "+ matrix_grades[i][3]+
                       ": final grades: "+ final_grades);
        }
    }
}
