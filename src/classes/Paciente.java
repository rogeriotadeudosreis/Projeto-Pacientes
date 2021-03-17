package classes;

public class Paciente {

    private String dataConsulta = "";
    private String nome = "";
    private char sexo = 'a';
    private int idade = 0;
    private float peso = 0;
    private float altura = 0;

    public Paciente()throws Exception {

    }

    public Paciente(String dataConsulta, String nome, char sexo, int idade, float peso, float altura)throws Exception {
            
        this.dataConsulta = dataConsulta;
        this.nome = nome;
        this.sexo = sexo;
        if(sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M'){
        throw new Exception("Sexo Inválido - Digite Novamente");
    }        
        this.idade = idade;
        if (idade <= 0) {
            throw new Exception("Idade Informada Inválida - Digite Novamente");
        }
        this.peso = peso;
        if (peso <=0) {
            throw new Exception("Peso Inválido - Digite Novamente");
        }
        this.altura = altura;
        if (altura <=0) {
            throw new Exception("Altura Inválida - Digite Novamente");
        }
    }

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        System.out.println("Valor do IMC: " + imc);
        if (imc < 18.5) {
            System.out.println("VOCÊ ESTÁ BAIXO DO NORMAL");
        } else if (imc > 18.4 && imc <= 24.9) {
            System.out.println("PARABÉNS! VOCÊ ESTÁ COM O PESO IDEAL.");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("CLASSIFICAÇÃO DO IMC --> SOBREPESO I");
        } else if (imc > 29.9 && imc <= 39.9) {
            System.out.println("CLASSIFICAÇÃO DO IMC --> GRAU DE OBESIDADE II");
        } else {
            System.out.println("CLASSIFICAÇÃO DO IMC --> GRAU DE OBESIDADE III - GRAVE");
        }

        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade)throws Exception {
       if (idade <= 0) {
            throw new Exception("Idade Informada Inválida - Digite Novamente");
        }
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso)throws Exception {
        if (peso <=0) {
            throw new Exception("Peso Inválido - Digite Novamente");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura)throws Exception {
        if (altura <=0) {
            throw new Exception("Altura Inválida - Digite Novamente");
        }
        this.altura = altura;
    }

    public void setSexo(char sexo)throws Exception {
        if(sexo !='f' || sexo != 'F' || sexo != 'm' || sexo != 'M'){
        throw new Exception("Sexo Inválido - Digite Novamente");
    }    
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    @Override
    public String toString() {
        String saida;
        saida = "------------ DADOS DO PACIENTE ------------" + "\n";
        saida += "Data da Consulta:         " + getDataConsulta() + "\n";
        saida += "Nome do paciente:         " + getNome() + "\n";
        saida += "Sexo:                     " + getSexo() + "\n";
        saida += "Idade:                    " + getIdade() + "\n";
        saida += "Peso:                     " + getPeso() + "\n";
        saida += "Altura:                   " + getAltura() + "\n";
        return saida;
    }
}
