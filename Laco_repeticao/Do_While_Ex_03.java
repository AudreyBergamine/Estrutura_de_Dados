package Laco_repeticao;

import javax.swing.JOptionPane;

public class Do_While_Ex_03 {
    public static void main(String[] args) {

        System.out.println("\n\n");
        String nome, sexo;    
        int idade = 0; 
        double salario;
        
        // LOOP PARA VERIFICAR SE O NOME ESTÁ CORRETO
        boolean nomeValido = false;  
        do {
            nome = JOptionPane.showInputDialog("Insira o NOME: ");
            if (nome.length() >= 3) {
                nomeValido = true;                
            } else {
                JOptionPane.showMessageDialog(null, "O nome precisa de no mínimo 3 caracteres! ");
            }            
        } while (!nomeValido);

        // LOOP PRA VERIFICAR SE A IDADE ESTÁ CORRETA
        boolean idadeValida = false;  
        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a IDADE: "));
            if (idade >= 0 && idade <130) {
                idadeValida = true;                
            } else {
                JOptionPane.showMessageDialog(null, "Idade inválida!!!\nDigite um valor entre 0 e 130");
            }            
        } while (!idadeValida);


        // LOOP PRA VERIFICAR SE O SALÁRIO ESTÁ CORRETO
        boolean salarioValido = false;
        do {
            salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o SALÁRIO: "));
            if (salario > 0 ) {
                salarioValido = true;                
            } else {
                JOptionPane.showMessageDialog(null, "Salário Inválido! \nDigite Novamente!");                
            }            
        } while (!salarioValido);


        // LOOP PRA VERIFICAR O SEXO
        boolean sexoValido = false; // Flag
        do {
            sexo = JOptionPane.showInputDialog("Digite: \n\n'F' para Feminino \nOU \n'M' para Masculino");
            if (sexo.equalsIgnoreCase("F") 
            || sexo.equalsIgnoreCase("M")) {
                sexoValido = true;                
            } else {
                JOptionPane.showMessageDialog(null, "Gênero Inválido! \nDigite 'F' ou 'M' !");                
            }            
        } while (!sexoValido);

        JOptionPane.showMessageDialog(null, "Nome:\t\t    " + nome 
                                                        + "\nIdade:\t\t    " + idade
                                                        + "\nSalario:\t\t  " + salario
                                                        + "\nGenero:\t\t  " + sexo);
    }
}
// JOptionPane.showInputDialog(" ");
// Integer.parseInt(JOptionPane.showInputDialog(" "));
// Double.parseDouble(JOptionPane.showInputDialog(" "));

// JOptionPane.showMessageDialog(null, " ");

