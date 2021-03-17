
package classes;

import javax.swing.JOptionPane;


public class StartPacientes {
    
    public static void mostrarDadosPaciente(Paciente objeto){
        System.out.println("------------- Dados Adicionais ------------");       
        System.out.println(objeto.calcularIMC());
        System.out.println("-------------------------------------------\n\n");
                          
    }
    
    public static void main(String[] args) {
        try{
        Paciente paciente = new Paciente("24/04/2020","Rogério",'M' ,47, 84, 1.75f);
        PacienteHomem pacienteH = new PacienteHomem("02/05/2020", "Godofredo", 'M', 48, 75, 1.85f);
        PacienteMulher pacienteM = new PacienteMulher("05/05/2020", "Florentina",'F', 40, 65, 1.65f);
        
        System.out.print(paciente.toString());
        mostrarDadosPaciente(paciente);
        System.out.print(pacienteH.toString());
        mostrarDadosPaciente(pacienteH);
        System.out.print(pacienteM.toString());
        mostrarDadosPaciente(pacienteM);
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        
    }
    
    
    
}
