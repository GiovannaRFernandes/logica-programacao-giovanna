//APS DE LÓGICA DE PROGRAMAÇÃO - Giovanna Rocha Fernandes
//Guia rápido de segurança digital + Teste/Quiz
//TÓPICOS: Senhas Seguras, Phishing e Golpes Online
//Fonte do conteúdo: cartilha.cert.br
//CERT.BR. Autenticação. São Paulo: Nic.Br, [202-]. Disponível em: https://cartilha.cert.br/fasciculos/autenticacao/fasciculo-autenticacao.pdf. Acesso em: 7 maio 2026.
//CERT.BR. Golpes: evite fraudes. São Paulo: Nic.Br, [202-]. Disponível em: https://cartilha.cert.br/fasciculos/golpes-evite-fraudes/fasciculo-golpes-evite-fraudes.pdf. Acesso em: 7 maio 2026.
//CERT.BR. Golpes: não se deixe enganar. São Paulo: Nic.Br, [202-]. Disponível em: https://cartilha.cert.br/fasciculos/golpes/fasciculo-golpes.pdf. Acesso em: 7 maio 2026. 

import java.util.Scanner;

public class APSLogProgramacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        //Início do programa, o menu principal
        while( opcao != 0) {
            System.out.println("----------------------------------------------------");
            System.out.println("****** OLÁ! SEREI SEU GUIA DE SEGURANÇA DIGITAL ******");
            System.out.println("----------------------------------------------------");
            System.out.println("O que você deseja fazer hoje?");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Consultar dicas rápidas de segurança");
            System.out.println("2. Fazer o teste: Você sabe se proteger no mundo digital?");
            System.out.println("0. Sair do programa");
            System.out.println("----------------------------------------------------");
            System.out.println("Escolha uma das opções: ");
            opcao = sc.nextInt();

            //Menu do guia, onde o usuário a opção que quer consultar
            switch (opcao){
                case 1: 
                    int opcaoGuia = -1;
                    while (opcaoGuia != 0){
                    System.out.println("1. Senhas Seguras" );
                    System.out.println("2. Phishing e Golpes");
                    System.out.println("0. Voltar ao menu principal");
                    System.out.println("Escolha uma das opções: ");
                    opcaoGuia = sc.nextInt();

                    switch(opcaoGuia){
                        case 1:
                        System.out.println("***SENHAS SEGURAS***");
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> CRIE SENHAS FORTES E USE UMA SENHA DIFERENTE PARA CADA CONTA: ");
                        System.out.println("-Crie senhas longas, misturando números, caracteres especiais e letras.");
                        System.out.println("-Evite informações pessoais.");
                        System.out.println("-Usar a mesma senha em vários lugares é arriscado; se uma vazar, troque todas imediatamente.");
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> ATIVE E USE A VERIFICAÇÃO EM DUAS ETAPAS DE FORMA SEGURA: ");
                        System.out.println("-Adicione uma segunda camada de proteção. Mesmo que descubram sua senha, o invasor precisará de outra informação.");
                        System.out.println("-Prefira chaves físicas ou aplicativos de código e negue qualquer autorização que você não solicitou.");
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> GUARDE SUAS SENHAS DE FORMA SEGURA E NÃO COMPARTILHE: ");
                        System.out.println("-Use gerenciadores de senhas ou anote em local físico seguro.");
                        System.out.println("-Nunca repasse códigos ou senhas por mensagens ou ligações.");
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> NÃO IGNORE OS AVISOS DE LOGIN E ALTERE SENHAS EXPOSTAS: ");
                        System.out.println("-Fique atento a vazamentos e alertas de acessos suspeitos.");
                        System.out.println(" -Se perceber algo errado, acesse o serviço diretamente (sem clicar em links) e troque a senha.");
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> CUIDADO PARA NÃO PERDER SEUS MECANISMOS DE AUTENTICAÇÃO: ");
                        System.out.println("-Se trocar de celular ou perder um dispositivo confiável, remova-o imediatamente dos serviços configurados.");
                        System.out.println("----------------------------------------------------");
                        break;

                        case 2:
                        System.out.println("***PHISHING E GOLPES ONLINE***");
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> O QUE É PHISHING E COMO PROTEGER SUAS CONTAS: ");
                        System.out.println("-É uma \"pescaria\" de dados onde golpistas jogam iscas (mensagens) para fisgar seus dados.");
                        System.out.println("-A melhor defesa é usar senhas fortes e redobrar a atenção em contas importantes.");
                        
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> NÃO ACESSE QUALQUER LINK E USE APENAS SITES OU APPS OFICIAIS: ");
                        System.out.println("-Links e QR Codes podem levar a páginas falsas ou instalar vírus.");
                        System.out.println("-Confira sempre a URL (endereço) e instale apps apenas de lojas oficiais.");
                        System.out.println("-Desconfie até de mensagens vindas de conhecidos.");
                    
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> CONFIRA OS DADOS DE BOLETOS E SÓ PAGUE NA PLATAFORMA ORIGINAL: ");
                        System.out.println("-Antes de pagar, verifique se os dados do beneficiário (CNPJ/Nome) conferem.");
                        System.out.println("-Nunca pague taxas extras por fora dos canais oficiais da compra.");
                    
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> VERIFIQUE SE O VENDEDOR É CONFIÁVEL E DESCONFIE SEMPRE: ");
                        System.out.println("-Pesquise a reputação e desconfie de ofertas boas demais.");
                        System.out.println("-Golpistas usam urgência e até Inteligência Artificial (áudios e vídeos falsos) para passar credibilidade.");
                    
                        System.out.println("----------------------------------------------------");
                        System.out.println("==> FIQUE ATENTO A GOLPES DO DIA A DIA E SUSPEITE MESMO QUE SAIBAM SEUS DADOS:");
                        System.out.println("-Temas como \"CPF cancelado\" ou \"encomenda retida\" são iscas comuns.");
                        System.out.println("-Golpistas podem usar dados vazados para parecerem reais. Na dúvida, não responda, bloqueie e denuncie.");
                        System.out.println("----------------------------------------------------"); 
                        break;

                        case 0:
                        System.out.println("Voltar ao menu principal");
                        break;

                        default:
                        System.out.println("Ops, não reconheci essa opção! Que tal tentar de novo?");
                        break;
                    }    
                
                    }
                    break;

                //Início do teste/quiz
                case 2:
                    int pontuacao = 0;
                    
                     //Início do teste/quiz
                    System.out.println("----------------------------------------------------");
                    System.out.println("==>Vamos descobrir se você é um especialista em segurança digital!<==");
                    System.out.println("Escolha a opção que mais combina com você: A, B ou C.");
                    
                    //SITUAÇÃO 1: problemas com senha do banco   
                    System.out.println("----------------------------------------------------"); 
                    System.out.println("Você abriu uma conta nova e chegou a hora de criar aquela senha 'perfeita'.");
                    System.out.println("O que passa pela sua cabeça na hora de escolher os números?");
                    System.out.println("A) Vou colocar o nome do meu pet + o ano em que ele nasceu. Impossível eu esquecer");
                    System.out.println("B) Vou deixar o gerenciador de senhas criar um código maluco cheio de símbolos e salvar lá.");
                    System.out.println("C) Vou de data de nascimento mesmo. É prática, simples e o banco aceita.");
                    String resposta1 = sc.next();
                    switch(resposta1) {
                    case "A":
                        pontuacao = pontuacao + 1;
                        break;
                    case "B":
                        pontuacao = pontuacao + 2;
                        break;
                    case "C":
                        pontuacao = pontuacao + 0;
                        break;
                    }

                    //SITUAÇÃO 2: SMS perigoso
                    System.out.println("----------------------------------------------------"); 
                    System.out.println("Seu celular vibra com um SMS urgente:");
                    System.out.println("'ALERTA: Seu CPF está irregular e será CANCELADO. Regularize agora em: bit.ly/link-estranho'.");
                    System.out.println("Bate aquele frio na barriga. Qual sua reação?");
                    System.out.println("A) Clico na hora! Não posso ficar com o CPF sujo por nada nesse mundo.");
                    System.out.println("B) Ignoro o link e o SMS. Vou entrar direto no site oficial da Receita Federal para ver se há algo errado.");
                    System.out.println("C) Fico na dúvida. Encaminho para o grupo da família ou para um amigo para saber se eles receberam também.");
                    String resposta2 = sc.next();
                    switch(resposta2){
                    case "A":
                        pontuacao = pontuacao + 0;
                        break;
                    case "B":
                        pontuacao = pontuacao + 2;
                        break;
                    case "C":
                        pontuacao = pontuacao + 1;
                        break;
                    }

                    //SITUAÇÃO 3: vazamento de dados
                    System.out.println("----------------------------------------------------"); 
                    System.out.println("Sabe aquela sua senha 'coringa' que você usa em tudo?");
                    System.out.println("Você acaba de ler uma notícia que um site onde você tem cadastro vazou os dados de todo mundo. E agora?");
                    System.out.println("A) Troco a senha só naquele site específico e sigo a vida.");
                    System.out.println("B) Fico de olho no meu e-mail. Se eu notar algo estranho, eu mudo.");
                    System.out.println("C) Bate o desespero (com razão!): troco a senha agora mesmo em todos os apps que usam esse mesmo código.");
                    String resposta3 = sc.next();
                    switch(resposta3) {
                    case "A":
                        pontuacao = pontuacao + 1;
                        break;
                    case "B":
                        pontuacao = pontuacao + 0;
                        break;
                    case "C":
                        pontuacao = pontuacao + 2;
                        break;
                    }

                    //SITUAÇÃO 4: promoção enganosa
                    System.out.println("----------------------------------------------------");
                    System.out.println("Você está rolando o feed e aparece aquele tênis dos seus sonhos por um preço inacreditável: de R$ 800 por apenas R$ 49,90. É a última unidade!");
                    System.out.println("A) Compro na hora! Uma promoção dessa não se deixa passar, o estoque vai voar.");
                    System.out.println("B) Desconfio na hora. Pesquiso o nome da loja no Reclame Aqui e busco o site oficial da marca.");
                    System.out.println("C) Mando um direct para o perfil perguntando se o produto é original e se eles entregam mesmo.");
                    String resposta4 = sc.next();
                    switch(resposta4) {
                    case "A":
                        pontuacao = pontuacao + 0;
                        break;
                    case "B":
                        pontuacao = pontuacao + 2;
                        break;
                    case "C":
                        pontuacao = pontuacao + 1;
                        break;
                    }

                    //SITUAÇÃO 5: invasor fantasma
                    System.out.println("----------------------------------------------------"); 
                    System.out.println("Você está assistindo série e, do nada, o celular notifica: ");
                    System.out.println("'Alguém está tentando acessar sua conta de e-mail em São Paulo. Deseja autorizar?'. Mas você está bem ali no sofá...");
                    System.out.println("A) Clico em 'Sim'. Deve ser só o sistema atualizando ou algum backup do Google.");
                    System.out.println("B) Nego o acesso imediatamente e corro para trocar a senha da conta.");
                    System.out.println("C) Fecho a notificação e volto para a minha série. Se eu não autorizei, nada vai acontecer.");
                    String resposta5 = sc.next();
                    switch (resposta5) {
                    case "A":
                        pontuacao = pontuacao + 0;
                        break;
                    case "B":
                        pontuacao = pontuacao + 2;
                        break;
                    case "C":
                        pontuacao = pontuacao + 1;
                        break;
                    }

                    //Resultado dos perfis
                    if (pontuacao >=0 && pontuacao <= 3) {
                        System.out.println("----------------------------------------------------");
                        System.out.println("===> 0 a 3 pontos: Perfil Preocupante <===");
                        System.out.println("Xiii... Se eu fosse você, abriria o guia de dicas agora mesmo! Seus dados estão mais expostos do que você imagina. Ainda dá tempo de se proteger!");
                        System.out.println("----------------------------------------------------");
                    } else if (pontuacao >= 4 && pontuacao <= 7) {
                        System.out.println("----------------------------------------------------");
                        System.out.println("===> 4 a 7 pontos: Perfil Intermediário <===");
                        System.out.println("Você está no caminho certo, mas ainda escorrega em algumas situações. Com um pouquinho mais de atenção, nenhum golpista vai te pegar!");
                        System.out.println("----------------------------------------------------");
                    } else {
                        System.out.println("----------------------------------------------------");
                        System.out.println("===> 8 a 10 pontos: Perfil Seguro <===");
                        System.out.println("Uau! Você é praticamente um especialista em segurança digital! Seus dados estão em boas mãos... as suas! Parabéns, continue assim");
                        System.out.println("----------------------------------------------------");
                    }
                    
                    break;
                
                case 0:
                    System.out.println("Até a próxima! Espero ter ajudado você a se proteger melhor no mundo digital.");
                    break;
                
                default:
                    System.out.println("Ops, não reconheci essa opção. Tente 1, 2 ou 0!");
                    break;

        }

                
            }
        sc.close();
        }
    }
