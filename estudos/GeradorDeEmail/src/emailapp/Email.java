package emailapp;
import java.util.Scanner;

public class Email {
        private String firstName;
        private String lastName;
        private String password;
        private int defaultpasswordLength = 9;
        private String department;
        private String email;
        private String companySuffix = "company.com";
        private int mailboxCapacity = 500;
        private String alternateEmail;
    

        //Construtora que vai receber o primeiro e o último nome.
        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            //System.out.println("Email Created: " + this.firstName+ " " + this.lastName);

            //chamar um método que pede o departamento - retornar departamento
            this.department = setDepartament();
            //System.out.println("Departamento " + this.department);

            //Chamar um método que retorna uma senha aleatória.
            this.password = randomPassword(defaultpasswordLength);
            System.out.println("Sua senha é "+ this.password);

            //Combinar os elementos em um email.
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
            //System.out.println("Seu email é " + email);
        }
        //Perguntar qual departamento.
        private String setDepartament() {
            System.out.print("Código dos departamentos:\n1 - para vendas\n2 - para desenvolvimento\n3 - para contabilidade\n0 para nenhum\nDigite o código do departamento ");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();

            if (depChoice == 1) { return "ven";} 
            else if (depChoice == 2) { return "dev"; } 
            else if (depChoice == 3) { return "con"; }
            else { return ""; }
        }
        //Gerar uma senha aleatória.
        private String randomPassword(int length) { 
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
            char[] password = new char[length];
            for (int i = 0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            }
            return new String(password);
        }
        //Alocar a capacidade da caixa de entrada.
        public void setMailboxCapacity(int capacity) {
            this.mailboxCapacity = capacity;
        }
        //Definir e-mail alternativo.
        public void setAlternateEmail (String altEmail) {
            this.alternateEmail = altEmail;
        }
        //Mudar a senha.
        public void changePassword (String password) {
            this.password = password;
        }

        public int getMailboxcapacity() { return mailboxCapacity; }
        public String getAlternateEmail() { return alternateEmail; }
        public String getPassword() { return password; }

        public String showInfo() { 
            return "Nome: " + firstName + " " + lastName + 
            "\nE-mail da empresa: " + email + 
            "\nCapacidade da núvem: " + mailboxCapacity + "mb";
        }
    }
