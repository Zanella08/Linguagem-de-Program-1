algoritmo "Calculo de Notas"

var
   P1, Entrega1, Entrega2, X, SUB, API, EXF: real
   N, NotaFinal: real

inicio

   escreval("===== CALCULO DE NOTA =====")
   escreval("")

   escreva("Digite a nota da P1: ")
   leia(P1)

   escreva("Digite a nota da Entrega 1: ")
   leia(Entrega1)

   escreva("Digite a nota da Entrega 2: ")
   leia(Entrega2)

   escreva("Digite a nota das atividades extras (X): ")
   leia(X)

   escreva("Digite a nota da substitutiva (SUB): ")
   leia(SUB)

   escreva("Digite a nota da API: ")
   leia(API)

   escreva("Digite a nota do Exame Final (EXF): ")
   leia(EXF)

   N <- P1 * 0.5 + Entrega1 * 0.2 + Entrega2 * 0.3 + X + SUB * 0.15

   se N > 5.9 entao

      NotaFinal <- (N * 0.5) + (API * 0.5)

   senao

      NotaFinal <- N * 0.5

   fimse

   se EXF > NotaFinal entao
      NotaFinal <- EXF
   fimse

   escreval("Nota final: ", NotaFinal:5:2)

   se NotaFinal >= 6 entao
      escreval("APROVADO!")
   senao
      escreval("REPROVADO!")
   fimse

fimalgoritmo