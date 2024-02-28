# Infraestrutura como Código com AWS CDK (Cloud Development Kit) em Java

O AWS CDK (Amazon Web Services Cloud Development Kit) é uma ferramenta que permite aos desenvolvedores definir infraestrutura como código usando linguagens de programação familiares, como Python, TypeScript, Java e C#. 

Com o CDK, é possível criar e gerenciar recursos na AWS de forma programática, proporcionando maior flexibilidade, reutilização e controle sobre a infraestrutura. Ele simplifica a criação de stacks de recursos, como instâncias EC2, buckets S3 e funções Lambda, através de uma abstração de alto nível, traduzindo o código em CloudFormation para provisionar os recursos na AWS de maneira consistente e escalável.

## Passos para Instalação do AWS CDK no Linux Ubuntu

Para começar a usar o CDK, é necessário ter o Node.js instalado, o que pode ser feito com o NVM (Node Version Manager).

### NVM (Node Version Manager)

O NVM é uma ferramenta que permite gerenciar facilmente várias versões do Node.js em um único sistema. Ele é útil quando você precisa alternar entre diferentes versões do Node.js para projetos específicos. Com o NVM, você pode instalar, desinstalar e alternar entre diferentes versões do Node.js com facilidade, garantindo compatibilidade com diferentes projetos que podem exigir versões específicas.

1. Instalação do NVM
Para instalar o NVM, siga as instruções na [Clique aqui para visitar o Google](https://www.google.com "Visite o Google")

2. Instalação do Node.js com NVM
Após instalar o NVM, abra um novo terminal.

Para instalar a versão mais recente do Node.js, utilize o comando:

```hcl
nvm install node
```
Isso instalará a versão mais recente do Node.js.

3. Verificação da instalação
Você pode verificar se o Node.js foi instalado corretamente com:

```hcl
node -v
```
4. Instalação do CDK
Com o Node.js instalado, você pode instalar o AWS CDK globalmente utilizando o npm (Node Package Manager), que é instalado automaticamente com o Node.js. Execute:

```hcl
npm install -g aws-cdk
```
5. Verificação da instalação do CDK
Para garantir que o AWS CDK foi instalado corretamente, verifique a versão com:

```hcl
cdk --version
```

Agora será possível usar o AWS CDK para criar e gerenciar recursos na AWS de forma programática, utilizando infraestrutura como código. 

O NVM facilita o gerenciamento de várias versões do Node.js em seu sistema, permitindo uma transição suave entre diferentes projetos que podem requerer versões específicas do Node.js.

## Passos para Criar um Projeto em Java com o AWS CDK

1. Instalação do Java Development Kit (JDK):
- Certifique-se de ter o JDK instalado em sua máquina. Você pode verificar se o JDK está instalado usando o comando:

```hcl
java -version
```
2. Instalação do AWS CDK:
Certifique-se de ter o AWS CDK instalado seguindo os passos na seção anterior.

3. Criar um novo diretório para o projeto:
Abra um terminal e crie um novo diretório para o seu projeto CDK em Java:

```hcl
mkdir meu-projeto-cdk-java
```

```hcl
cd meu-projeto-cdk-java
```
4. Inicializar o Projeto CDK em Java:
Use o comando cdk init para inicializar um novo projeto CDK em Java. Isso criará uma estrutura básica para o seu projeto.

```hcl
cdk init app --language java
```
5. Abrir o Projeto no seu Editor de Código preferido:
Agora que o projeto foi criado, você pode abrir o diretório no seu editor de código preferido, como VSCode, IntelliJ IDEA, Eclipse, etc.

## Recursos que serão utilizados

- AWS CDK
- AWS CLI
- CloudFormation
- Elastic Container Service (ECS)
- Fargate
- Application Load Balancer (ALB)
- Virtual Private Cloud (VPC)
- Relational Database Service (RDS)
- DynamoDB (NoSQL)
- Simple Notification Service (SNS)
- Simple Queue Service (SQS)
- Simple Storage Service (S3)
- CloudWatch Logs
- CloudWatch Metrics
- Docker e Docker.Hub

## Porque containeres Docker?

- Melhor gerenciamento de uso de recursos tais como CPU e memória.
- A aplicação é executada sempre no mesmo ambiente.
- Facilidade em criar novas instâncias em um cenário de escala horizontal.
- Execução de tarefas gerenciáveis em uma instância AWS ECS.

## CloudFormation

- Processo automatizado (IaaC proprietário da AWS) para provisionamento de recursos na AWS.
- Versionamento dos templates
- Controle de mudanças.
- Réplicas de infraestrutura.

### Stack

Coleção de recursos com seus processos de criação, alteração e exclusão gerenciados pelo CloudFormation.













