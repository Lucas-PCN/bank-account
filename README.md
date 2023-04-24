# Projeto Bank account

<p>Projeto entregue durante o curso de desenvolvimento Web ministrado pela <a href="https://www.betrybe.com" targe="_blank" rel="nofollow">Trybe</a>.</p>

<p>Obtive a aprovação no projeto completando 100% dos requisitos obrigatórios e opcionais. Efetivando, assim, a conclusão do Bloco 7 (Gestão de dependências) referente a Aceleração em Java.</p>

## Descrição
**Pequeno sistema de apoio à validação de contas bancárias.**

O desenvolvimento deste sistema tem como objetivo garantir que o formato das contas informadas pela pessoa usuária esteja de acordo com as diretrizes da  instituição (contas com 6 dígitos).

:pushpin: O projeto foi definido como `gradle` para manter a gestão de dependências automatizada, escalável e distribuída;

:pushpin: Utilizou-se a biblioteca `Apache Commons Lang` na versão `3.11` para garantir a aderência entre todos os outros projetos da "empresa";

:pushpin: Empacotou-se a aplicação no formato `jar`.

## Rodando o projeto localmente
  1. Clone o repositório
   
     `git@github.com:Lucas-PCN/bank-account.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd bank-account`

## Demonstração

### 🟡 A pessoa usuária informa o número da conta bancária no console do sistema. 

O sistema valida se o valor informado é maior, menor ou igual a 6 dígitos    

> - ❌ Valores não númericos não serão aceitos;
> - ❌ `conta < 6 dígitos`: adicionará zeros à esquerda até atender ao tamanho de 6 números;
> - ❌ `conta > 6 dígitos`: será removidos todos os números antes dos 6 últimos;
> - ✅ `conta = 6 dígitos`: já está aderente, o valor permanecerá inalterado.

### 🔸 Exemplos de entradas e saídas

- Se a pessoa usuária informar a conta `123` no input do console, irá obter como resultado um feedback ok:
```
    Informe o número da conta:
    123
    Número da conta: 000123
```

- No entanto, se a pessoa usuária informar a conta `1234567890` no input do console, irá obter como resultado a mensagem de aviso:
```
    Informe o número da conta:
    1234567890
    Número da conta: 567890
```

- Caso seja informado um valor não numérico (por exemplo `12345-X`), uma mensagem validando aparecerá:
```
    Informe o número da conta: 
    12345-X
    Número da conta inválido!
```
---

Projeto desenvolvido por Lucas Castanheira, para fins didáticos. 2023
