import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a opção desejada: \n 1). BabySteps \n 2). Hello Clarice \n 3). BitInformation \n 4). UmPoucoDeGeometria \n 5). OneTwoThree \n 6). QualMaior \n  7). QualMaior2x \n 8). QualOque \n 9). CincoVezes \n 10). EnquantoIsso \n 11). CansarDeDigitar \n 12). Parabéns \n 13). Booommm \n 14). UmDoisTres \n 15). QuantoEmQuanto \n 16). PassouNoTeste  ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                baby_steps();
                break;
            case 2:
                hello_clarice();
                break;
            case 3:
                bit_information();
                break;
            case 4:
                um_poucoDeGeometria();
                break;
            case 5:
                one_two_three();
                break;
            case 6:
                qualMaior();
                break;
            case 7:
                qualMaior4x();
                break;
            case 8:
                qualOque();
                break;
            case 9:
                CincoVezes();
                break;
            case 10:
                EnquantoIsso();
                break;
            case 11:
                CansarDeDigitar();
                break;
            case 12:
                Parabéns();
                break;
            case 13:
                Booom();
                break;
            case 14:
                UmDoisTres();
                break;
            case 15:
                QuantoEmQuanto();
                break;
            case 16:
                PassouNoTeste();

            default:
                System.out.println("Número Inválido! Insira uma opção entre 1 e 16");
        }

    }

    public static void baby_steps(){
        String Planeta = "Plutão";

        System.out.println(Planeta);
    }//EXERCICIO 1 - DECLARA UMA VARIAVEL PLANETA E EXIBE O CONTEUDO

    public static void hello_clarice(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Olá, " + nome);
    }//EXERCICIO 2 - RECEBE UM TEXTO COMO VALOR E EXIBE PARA O USUÁRIO

    public  static void bit_information(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Insira a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Olá, " + nome + ". Sua idade é: " + idade);
    }//EXERCICIO 3 - RECEBE UM TEXTO E UM VALOR E EXIBE PARA O USUARIO

    public static void um_poucoDeGeometria(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Função que executa 7 calculos das areas de figuras planas" + System.lineSeparator());
        //***************************************************************************************************

        System.out.println("1º Calculo - Retangulo" + System.lineSeparator()); //CALCULO RETANGULO

        System.out.println("Insira a medida da base do retangulo: ");
        int base = scan.nextInt();

        System.out.println("Insira a  medida da altura do retangulo: ");
        int altura = scan.nextInt();

        int areaRetangulo = base * altura;

        System.out.println("A medida area do retangulo é: " + areaRetangulo + System.lineSeparator());

        //****************************************************************************************************

        System.out.println("2º Calculo - Quadrado" + System.lineSeparator()); //CALCULO QUADRADO

        System.out.println("Insira a medida do lado esquerdo do quadrado: ");
        double quadradoLadoEsq = scan.nextDouble();

        System.out.println("Insira a medida do lado direito do quadrado: ");
        double quadradoLadoDir = scan.nextDouble();

        if(quadradoLadoDir != quadradoLadoEsq){

            quadradoLadoDir = quadradoLadoEsq;

        }

        double ladoVezesLado = quadradoLadoDir * quadradoLadoEsq;
        double areaQuadrado = Math.pow(ladoVezesLado, 2);

        System.out.println("A medida da area do quadrado é: " + areaQuadrado + System.lineSeparator());

        //****************************************************************************************************

        System.out.println("3º Calculo - Losango" + System.lineSeparator()); //CALCULO LOSANGO

        System.out.println("Insira a medida da diagonal maior: ");
        double diagonalMaior = scan.nextDouble();

        System.out.println("Insira a medida da diagonal menor: ");
        double diagonalMenor = scan.nextDouble();

        double areaLosango = ((diagonalMaior * diagonalMenor) / 2);

        System.out.println("A medida da area do Losango é: " + areaLosango + System.lineSeparator());

        //****************************************************************************************************

        System.out.println("4º Calculo - Trapezio"  + System.lineSeparator()); //CALCULO TRAPEZIO

        System.out.println("Insira a medida da base maior do trapezio: ");
        double  baseMaiorTrapezio = scan.nextDouble();

        System.out.println("Insira a medida da base menor do trapezio");
        double baseMenorTrapezio = scan.nextDouble();

        System.out.println("Insira a medida da altura do trapezio: ");
        double alturaTrapezio = scan.nextDouble();

        double areaTrapezio = ((baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio) / 2;

        System.out.println("A  medida da area do trapezio é: " + areaTrapezio + System.lineSeparator());

        //****************************************************************************************************

        System.out.println("5º Calculo - Paralelogramo" + System.lineSeparator()); //CALCULO PARALELOGRAMO

        System.out.println("Insira a medida da base do Paralelogramo: ");
        int baseParalelo = scan.nextInt();

        System.out.println("Insira a medida da altura do Paralelograma: ");
        int alturaParalelo = scan.nextInt();

        int areaParalelo = baseParalelo * alturaParalelo;

        System.out.println("A medida da area do Paralelogramo é: " + areaParalelo + System.lineSeparator());

        //****************************************************************************************************

        System.out.println("6º Calculo - Triangulo" + System.lineSeparator()); //CALCULO TRIANGULO

        System.out.println("Insira a medida da base do Triangulo: ");
        double baseTriangulo = scan.nextDouble();

        System.out.println("Insira a medida da altura do Triangulo: ");
        double alturaTriangulo = scan.nextDouble();

        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        System.out.println("A medida da area do Triangulo é: " + areaTriangulo + System.lineSeparator());

        //****************************************************************************************************

        System.out.println("7º Calculo - Circulo" + System.lineSeparator()); //CALCULO CIRCULO

        System.out.println("Insira a medida do raio do circulo: ");
        double raioCirculo = scan.nextInt();

        double piCirculo = 3.14;

        double areaCirculo = piCirculo * Math.pow(raioCirculo,2);

        System.out.println("A medida da area do circulo é: " + areaCirculo + System.lineSeparator());

        //***************************************************************************************************

        //FIM DA FUNÇÃO DE CALCULOS

        System.out.println("Fim da função, todos os calculos foram efetuados com sucesso");
    }//EXERCICIO 4 - EXECUTA CALCULOS DE AREAS DE 7 FORMAS GEOMETRICAS PLANAS COM VALORES DE ENTRADA PELO USUARIO

    public static void one_two_three(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor(ele pode ser positivo, negativo ou neutro): ");
        int valorDesconhecido = scan.nextInt();

        if(valorDesconhecido > 0){

            System.out.println(valorDesconhecido + ", é positivo");

        }else if(valorDesconhecido < 0){

            System.out.println(valorDesconhecido + ", é negativo");

        }else{

            System.out.println(valorDesconhecido + ", é neutro");

        }
    }//EXERCICIO 5 - RECEBE UM NUMERO DO USUARIO E VERIFICA SE É POSITIVO, NEGATIVO OU NEUTRO

    public static void qualMaior(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira 3 numeros: \n");

        System.out.print("Primeiro: \n");
        int n1 = scan.nextInt();

        System.out.print("Segundo: \n");
        int n2 = scan.nextInt();

        System.out.print("Terceiro: \n");
        int n3 = scan.nextInt();

        System.out.print("Verificando qual dos 3 é o maior... \n");

        if(n1 > n2 && n1 > n3){
            System.out.print("O primeiro número (" + n1 + ") é o maior dentre os três números inseridos");
        } else if (n2 > n1 && n2 > n3 ) {
            System.out.print("O segundo número (" + n2 + ") é o maior dentre os três números inseridos");
        }else{
            System.out.print("O terceiro número (" + n3 + ") é o maior dentre os três números inseridos");
        }
    }//EXERCICIO 6 - RECEBE 3 NUMEROS E VERIFICA QUAL É O MAIOR DENTRE OS 3

    public static void qualMaior4x(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira 4 numeros: \n");

        System.out.print("Primeiro: \n");
        int n1 = scan.nextInt();

        System.out.print("Segundo: \n");
        int n2 = scan.nextInt();

        System.out.print("Terceiro: \n");
        int n3 = scan.nextInt();

        System.out.println("Quarto: ");
        int n4 = scan.nextInt();

        System.out.println("___________________________________________________________________");
        System.out.println("Verificando qual é o maior dentre os numeros inseridos...");
        System.out.println("___________________________________________________________________\n");

        if(n1 > n2 && n1 > n3 && n1 > n4){
            System.out.println("O primeiro numero (" + n1 + ") é o maior numero dentre os 4 numeros inseridos");
        } else if (n2> n1 && n2 > n3 && n2 > n4) {
            System.out.println("O segundo numero (" + n2 + ") é o maior numero dentre os 4 numeros inseridos");
        } else if (n3 > n1 && n3 > n2 && n3 > n4) {
            System.out.println("O terceiro numero (" + n3 + ") é o maior numero dentre os 4 numeros inseridos");
        }else{
            System.out.println("O quarto numero (" + n4 + ") é o maior numero dentre os 4 numeros inseridos");
        }

    }//EXERCICIO 6.1 - RECEBE 4 NUMEROS E VERIFICA QUAL É O MAIOR DENTRE OS 4

    public static void qualOque(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira 3 numeros: \n");

        System.out.println("Primeiro: ");
        int n1 = scan.nextInt();

        System.out.println("Segundo: ");
        int n2 = scan.nextInt();

        System.out.println("Terceiro: ");
        int n3 = scan.nextInt();

        System.out.println("________________________________________________________________________________");
        System.out.println("Verificando qual é o maior dentre os numeros inseridos e efetuando a soma...");
        System.out.println("________________________________________________________________________________\n");

        if(n1 < n2 && n1 < n3){
            System.out.println("Os maiores numeros são: " + n2 + "," + n3 + " a soma deles é: " + (n2+n3));
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("Os maiores numeros são: " + n1 + "," + n3 + " a soma deles é: " + (n1+n3));
        }else{
            System.out.println("Os maiores numeros são: " + n1 + "," + n2 + " a soma deles é: " + (n2+n1));
        }
    }//EXERCICIO 7 - RECEBE 3 NUMEROS E EFETUA A SOMA DOS DOIS MAIORES

    public static void CincoVezes(){
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> Vetor = new ArrayList<>();

        for (int i = 0; i <= 4; i++){
            System.out.println("Insira um número: ");
            Vetor.add(scan.nextInt());
        }

        System.out.println("______________________________________________________________________");
        System.out.println("Verificando os dois maiores dos numeros inseridos e efetuando a soma");
        System.out.println("______________________________________________________________________\n");

        int menor = 0;
        int menor2 = 0;
        int maior = 0;
        int maior2 = 0;

        for (int i = 0; i <= 4; i++){
            if(i == 0){
                maior = Vetor.get(i);
                menor = Vetor.get(i);
            }

            if(Vetor.get(i) > maior){
                maior = Vetor.get(i);
            }
            if(Vetor.get(i) < menor){
                menor = Vetor.get(i);
            }

        }

        for(int i = 0; i <= 4; i++) {
            if (i == 0) {
                maior2 = Vetor.get(i);
                menor2 = Vetor.get(i);
            }

            if (Vetor.get(i) > maior2 && Vetor.get(i) != maior) {
                maior2 = Vetor.get(i);
            }
        }

        System.out.println("Os dois maiores entre os numeros inseridos são: " + maior + ", " + maior2 + " a soma dos números é: " + (maior + maior2));

    }//EXERCICIO 7.1 - RECEBE 5 NUMEROS E EFETUA A SOMA DOS MAIORES

    public static void EnquantoIsso(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número para dividir: ");
        int n1 = scan.nextInt();

        System.out.println("Insira um número para ser o divisor: ");
        float n2 = scan.nextFloat();

        while (n2 <= 0){
            System.out.println("O número que será o divisor não pode ser menor ou igual a zero. Tente com um número maior: ");
            n2 = scan.nextInt();
        }

        System.out.println("O resultado da divisão é: " + (n1 / n2));


    }//EXERCICIO 8 - RECEBE 2 VALORES PARA DIVISÃO E NÃO ACEITA O SEGUNDO VALOR COMO NUMERO NEUTRO OU NEGATIVO

    public static void CansarDeDigitar(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> Lista = new ArrayList<>();

        for(int i = 0;i <= 9;i++){
            System.out.println("Insira um valor: ");
            Lista.add(scan.nextInt());
        }

        System.out.println("Exibindo os valores inseridos: \n " + Lista);

        float soma = 0;

        for(int i = 0;i <= 9;i++){
            soma += Lista.get(i);
        }

        System.out.println("A média aritmética dos valores é: " + (soma / Lista.size()));
    }//EXERCICIO 9 - RECEBE 10 VALORES E CALCULA A MÉDIA ARITMETICA DELES

    public static void Parabéns(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Float> Notas = new ArrayList<>();

        for(int i = 0; i <= 3; i++){
            System.out.println("Insira a Nota do Aluno: ");
            Notas.add(scan.nextFloat());
        }

        System.out.println("As notas do aluno são: " + Notas);

        System.out.println("----------------------------------------------------\n");
        System.out.println("Calculando a média e situação do semestre....\n");
        System.out.println("----------------------------------------------------\n");

        float soma = 0;

        for(int i = 0; i <= 3;i++){
            soma += Notas.get(i);
        }

        if((soma / Notas.size()) >= 6){
            System.out.println("ALUNO APROVADO!! \n Média Semestral: " + (soma / Notas.size()));
        }else{
            System.out.println("ALUNO REPROVADO!! \n Média Semestral: " + (soma / Notas.size()));
        }
    }//EXERCICIO 10 - RECEBE 4 NOTAS DE UM ALUNO E VERIFICA MÉDIA SEMESTRAL DIZENDO SE FOI APROVADO OU NÃO

    public static void Booom(){
        int bomba = 30;

        System.out.println("Iniciando contagem regressiva: ");

        while(bomba >= 0){
            System.out.println(bomba--);
        }

        System.out.println("BOOOOOOOOMMMMMM");

    }//EXERCICIO 11 - CRONOMETRA A EXPLOSÃO DE UMA BOMBA

    public static void UmDoisTres(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

    }//EXERCICIO 12 - IMPRIME TODOS OS VALORES ENTRE 1 E 10

    public static void QuantoEmQuanto(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        float n1 = scan.nextFloat();

        System.out.println("Insira um número maior do que o primeiro (" + n1 + "): ");
        float n2 = scan.nextFloat();

        while(n2 < n1){
            System.out.println("Número Inválido!! Tente novamente com um número maior do que o primeiro (" + n1 + "):");
            n2 = scan.nextInt();
        }

        float diff = n2 - n1;
        float soma = 0;
        float cont = n1;

        while(cont <= n2){
            System.out.println(cont);
            soma += cont;
            cont++;
        }

        System.out.println("A média dos números entre: " + n1 + " e " + n2 + " é: " + (soma / diff));
    }//EXERCICIO 13 - RECEBE DOIS VALORES DIFERENTES E IMPRIME A MÉDIA ARITMÉTICA DE TODOS OS NUMEROS ENTRE ELES

    public static void PassouNoTeste(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Float> Notas = new ArrayList<>();
        ArrayList<Float> Media = new ArrayList<>();

        int resposta = 1;

        while(resposta == 1){
            Notas.clear();
            for (int i = 0; i < 2; i++) { //Adicionando notas em uma lista para calculo
                System.out.println("Insira a nota: ");
                Notas.add(scan.nextFloat());
            }

            float soma = 0;

            for (int i = 0; i < 2; i++) {
                soma += Notas.get(i);
            }

            Media.add((soma / Notas.size()));

            System.out.println("Deseja calcular a nota de mais um Aluno? (1 - Sim / 2 - Não)");
            resposta = scan.nextInt();
            System.out.println(resposta);

        }

        System.out.println("Segue as notas calculadas: " + Media);
    }//EXERCICIO 14 - RECEBE 2 NOTAS E CALCULA A MÉDIA DO ALUNO, LOGO EM SEGUIDA, PERGUNTA SE DESEJA INSERIR MAIS NOTAS
}