import java.util.Scanner;
public class App {

    public static void Ex1(){
        Scanner scan = new Scanner(System.in);
        float num1, num2, resultado;

        System.out.print("Insira num1");
        num1 = scan.nextFloat();
        System.out.print("Insira num2");
        num2 = scan.nextFloat();

        if(num1 == 0 || num2 == 0){
            System.out.println("Nao pode fazer divisao com 0");
            scan.close();
            return;
        }
        resultado = num1 / num2;
        System.out.println("resultado e" + resultado);
        scan.close();


    }

    public static void Ex2(){ 
        Scanner scan = new Scanner(System.in);
        float n1, n2,n3, media;

        System.out.print("Insira nota 1:");
        n1 = scan.nextFloat();
        System.out.print("Insira nota 2:");
        n2 = scan.nextFloat();

        System.out.print("Insira nota 3:");
        n3 = scan.nextFloat();

        media = (n1 + n2 + n3) / 3;

        if(media >= 7){
            System.out.println("aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }

        System.out.println("media:" + media);
        scan.close();

       return;
    }
    public static void Ex3(){ 
        Scanner scan = new Scanner(System.in);
        float Toteleitor, votoBranco, votoNulo, votoValido;
        float porcentagemB, porcentagemN, porcentagemV;

        System.out.println("insira total de eleitor");
        Toteleitor = scan.nextInt();
        System.out.println("insira votos brancos");
        votoBranco = scan.nextInt();
        System.out.println("insira votos nulos");
        votoNulo = scan.nextInt();
        System.out.println("insira votos validos");
        votoValido = scan.nextInt();
        scan.close();
        porcentagemB = votoBranco / Toteleitor;
        System.out.println("% de votos brancos"+ porcentagemB* 100 + "%");
        porcentagemN = votoNulo / Toteleitor;
        System.out.println("% de votos brancos"+ porcentagemN* 100 + "%");
        porcentagemV = votoValido / Toteleitor;
        System.out.println("% de votos brancos"+ porcentagemV * 100 + "%");


        return;
        
        
    }
    public static void Ex4(){ 
        Scanner scan = new Scanner(System.in);

        double salario, aumento1, aumento2, aumento3;
        aumento1 = 1.1;
        aumento2 = 1.2;
        aumento3 = 1.3;
        System.out.println("Informe salario");
        salario = scan.nextDouble();
        scan.close();
        
        if(salario <= 1000){
            salario *= aumento1;
            System.out.println("Salario novo:" + salario);
            return;
        }
        if(salario <= 2000){
            salario *= aumento2;
            System.out.println("Salario novo:" + salario);
            scan.close();
            return;
        }
        if(salario <= 3000){
            salario *= aumento3;
            System.out.println("Salario novo:" + salario);
            scan.close();
            return;
        }
        if(salario <= 4000){
            salario = (salario * aumento1) + 200;
            System.out.println("Salario novo:" + salario);
            scan.close();
            return;
        }

    }
    public static void Ex5(){ 
        Scanner scan = new Scanner(System.in);
            float imc, peso, altura;

            System.out.println("Insira peso:");
            peso = scan.nextFloat();
            System.out.println("Insira altura:");
            altura = scan.nextFloat();

            imc = peso / (altura * altura);

            if(imc < 20){
                System.out.println("abaixo do peso");
            }else if(imc <= 20 && imc >=25){
                System.out.println("peso normal");
            }else if(imc <= 25 && imc >=30){
                System.out.println("sobrepeso");
            }else if(imc <= 30 && imc >=40){
                System.out.println("obeso");
            }else if(imc >= 40){
                System.out.println("Obeso morbido");
            }
            scan.close();

    }
    public static void Ex6(){
        Scanner scan = new Scanner(System.in);
        int num = 999;
 


        System.out.println("Insira numero de 1 a 4:");
        num = scan.nextInt();
        while(num < 1 || num > 4){
            System.out.println("numero incorreto");
            System.out.println("Insira numero de 1 a 4:");
           num = scan.nextInt();
        }

        if(num == 1)
        System.out.println("primavera");
        if(num == 2)
        System.out.println("verao");
        if(num == 3)
        System.out.println("outono");
        if(num == 4)
        System.out.println("Inverno");
        scan.close();
    }
    
    





    public static void Ex7(){ 
        Scanner scan = new Scanner(System.in);
        String desproduto;
        float uniQuant, desconto = 1;
        int totQuant;

        System.out.println("Insira descricao do produto:");
        desproduto = scan.nextLine();

        System.out.println("Insira total de produtos");
        totQuant = scan.nextInt();

        System.out.println("Insira preco unitario:");
        uniQuant = scan.nextFloat();

        System.out.println("total" + (uniQuant * totQuant));

        if(totQuant <= 5)
        desconto = 0.98f;

        if(totQuant > 5 && totQuant <= 10)
        desconto = 0.97f;

        if(totQuant > 10 && totQuant < 30)
        desconto = 0.95f;

        if(totQuant >= 30)
        desconto = 0.9f;

        System.out.println("Nome do produto:" + desproduto);
        System.out.println("Total a pagar:" + (uniQuant * totQuant * desconto));
        scan.close();
        return;
    }
    public static void Ex8(){ 
        Scanner scan = new Scanner(System.in);
        float l1, l2, l3;

        System.out.println("Insira lado 1");
        l1 = scan.nextFloat();
        System.out.println("Insira lado 2");
        l2 = scan.nextFloat();
        System.out.println("Insira lado 3");
        l3 = scan.nextFloat();

        if(l1 == l2 && l1 == l3){
        System.out.println("triangulo equilatero");
        scan.close();
        return;
        }
        if(l1 == l2 || l1 == l3 || l2 == l3){
        System.out.println("triangulo isosceles");
        scan.close();
        return;
            }
        if(l1 != l2 && l1 != l3 && l2 != l3){
        System.out.println("triangulo escaleno");
        scan.close();
        return;
            }
            

            scan.close();
    }
    public static void Ex9(){ 
        Scanner scan = new Scanner(System.in);
        float idade;

        System.out.println("Insira a idade do eleitor");
        idade = scan.nextFloat();

        if(idade < 16){
        System.out.println("nao pode votar");
        scan.close();
        return;
        }
        if(idade >= 16 && idade <= 17){
        System.out.println("facultativo");
        scan.close();
        return;
        }
        if(idade > 65){
        System.out.println("facultativo");
        scan.close();
        return;
        }
        if(idade >= 18 && idade <=65){
        System.out.println("obrigatorio");
        scan.close();
        return;
        }
        scan.close();
    }
    public static void Ex10(){ 
        Scanner scan = new Scanner(System.in);
        float valor, lucro, res;

        lucro = 1;
        System.out.println("lojinha do sr Aboo");

        System.out.println("Insira valor:");
        valor = scan.nextFloat();

        if(valor < 10)
        lucro = 0.3f;
        if(10 <= valor && valor < 30)
        lucro = 0.5f;
        if(30 <= valor && valor < 50)
        lucro = 0.6f;
        if(valor >= 50)
        lucro = 0.7f;
        res = valor * lucro;
        System.out.println("Valor com lucro embutido:" + (res + valor));
        scan.close();
    }
    public static void Ex11(){ 
        Scanner scan = new Scanner(System.in);
        int op = 999, contagemS = 0, contagemD = 0;
        float saldo = 0, deposito = 0, saque = 0;

        while(op != 0){
            System.out.println("1- Exibe saldo");
            System.out.println("2- Exibe extrato");
            System.out.println("3- realizar deposito");
            System.out.println("4- realizar saque");
            System.out.println("0- sair");
            System.out.print("insira opcao:");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("saldo:" + saldo);
                    break;
                    case 2:
                    if(contagemS == 0 && contagemD == 0){
                        System.out.println("nenhuma transição feita");
                    }else if (contagemS != 0){
                        System.out.println("Saque: " + saque);
                    }else if(contagemD != 0){
                        System.out.println("Deposito" + deposito);
                    }

                    break;
                    case 3:
                    System.out.println("Insira valor do deposito:");
                    deposito = scan.nextFloat();
                    saldo+=deposito;
                    contagemD+= 1;
                    break;
                    case 4:
                    System.out.println("Insira valor do saque:");
                    saque = scan.nextFloat();
                    if(saque > saldo){
                        System.out.println("valor insuficiente de saldo");

                    }else{
                        saldo =saldo - saque;
                        contagemS+=1;
                    }
                    break;
                    case 0:
                    System.out.println("saindo");
                    break;
            
                default:
                System.out.println("opcao invalida");
                    break;
            }
            scan.close();



        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 999;

        while(op != 0){
            System.out.print("Insira sua opcao:");
            op = scan.nextInt();

            switch(op){
                case 1:
                Ex1();
                break;
                case 2:
                Ex2();
                break;
                case 3:
                Ex3();
                break;
                case 4:
                //Ele roda em todos os ifs caso o salario for menor ou igual a 1000, ou seja, tem aumento 4x
                Ex4();
                break;
                case 5:
                Ex5();
                break;
                case 6:
                Ex6();
                break;
                case 7:
                Ex7();
                break;
                case 8:
                Ex8();
                break;
                case 9:
                Ex9();
                break;
                case 10:
                Ex10();
                break;
                case 11:
                Ex11();
                break;
                default:
                System.out.println("opcao incorreta!");
                break;








            }

            


        scan.close();






        }

        

    }
}
