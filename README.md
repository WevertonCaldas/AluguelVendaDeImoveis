# **PROJETO DA DISCIPLINA EVOLUÇÃO DE SOFTWARE** 💻

### OBJETIVO: DESENVOLVER UMA APLICAÇÃO MONOLÍTICA, QUE CONSISTE EM UM SISTEMA ÚNICO E NÃO DIVIDIDO, EXECUTADO EM UM ÚNICO PROCESSO.

#### **Como funciona a arquitetura monolítica ?**

![](https://media.licdn.com/dms/image/C4D12AQHzSfIIc3nqjw/article-inline_image-shrink_1500_2232/0/1583924312772?e=1688601600&v=beta&t=NuhrKgYHEq_YBSwamm2XM5Y7Z5HvzqAitkbhOKpJbJc)

As principais linguagens de desenvolvimento de aplicações oferecem abstrações para quebrar a complexidade dos sistemas em módulos menores. Entretanto, são projetadas para a criação de um único executável monolítico, onde todo o processo, regra de negocio e modularização utilizada é executada em um mesmo contexto. Os módulos normalmente compartilham recursos de processamento, memória, bancos de dados e arquivos.

Ao longo do tempo o sistema vai crescendo e tornando-se cada vez mais complexo, consumindo cada vez mais recursos. Surgem também alguns desafios substanciais para sua manutenção:


1. Aumento de complexidade e tamanho ao longo do tempo: O sistema torna-se tão complexo que a manutenção fica cada vez mais cara e lenta, pois os desenvolvedores têm que navegar em uma infinidade de código. Quando existe a necessidade de mudar o desenvolvedor, perde-se dias em analise de código ate descobrir o correto lugar onde alterar!

2. Alta dependência de componentes de código: Muitas funções são interdependentes e entrelaçadas, de forma que a inclusão ou manutenção de componentes do sistema podem causar inconsistências ou comportamentos inesperados. Necessitando de um teste regressivo de toda a aplicação a cada pequena alteração, para garantir integridade do sistema.

3. Escalabilidade do sistema é limitada: Exige que todo o sistema seja replicado mesmo que apenas parte de suas funcionalidades sejam necessárias na nova instância, ocasionando custos de recursos de maquina, memoria, link e etc; maiores que o esperado.

4. Falta de flexibilidade: Restringe bastante a que os desenvolvedores fiquem amarrados à tecnologia originalmente escolhida para o sistema, mesmo que em algumas situações não seja a melhor escolha. Em alguns casos, limitando performance, ou a nives extremos limitando funcionalidade.

5. Dificuldade para colocar alterações em produção: Qualquer mudança, por menor que seja, requer a reinicialização do sistema, incorrendo em riscos operacionais e necessitando de acompanhamento da equipe de desenvolvimento, de testes e de manutenção do sistema como um todo.

Essa tipo de arquitetura deve ser utilizada quando o time não tem experiência com microsserviços; Se seu projeto for de curto prazo para entrega e você não tem tempo para gastar com automatização de deploy e orquestração dos serviços; você está criando um produto com nível alto de incerteza, tipo um MVP


[veja mais ](https://www.linkedin.com/pulse/microsservi%C3%A7o-vantagens-e-desvantagens-eduardo-silveira/?originalSubdomain=pt)
