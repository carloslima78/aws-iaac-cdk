# Infraestrutura como Código com AWS CDK (Cloud Development Kit) em Java

O AWS CDK (Amazon Web Services Cloud Development Kit) é uma ferramenta que permite aos desenvolvedores definir infraestrutura como código usando linguagens de programação familiares, como Python, TypeScript, Java e C#. 

Com o CDK, é possível criar e gerenciar recursos na AWS de forma programática, proporcionando maior flexibilidade, reutilização e controle sobre a infraestrutura. Ele simplifica a criação de stacks de recursos, como instâncias EC2, buckets S3 e funções Lambda, através de uma abstração de alto nível, traduzindo o código em CloudFormation para provisionar os recursos na AWS de maneira consistente e escalável.

## Passos para Instalação do AWS CDK no Linux Ubuntu

Para começar a usar o CDK, é necessário ter o Node.js instalado, o que pode ser feito com o NVM (Node Version Manager).

### NVM (Node Version Manager)

O NVM é uma ferramenta que permite gerenciar facilmente várias versões do Node.js em um único sistema. Ele é útil quando você precisa alternar entre diferentes versões do Node.js para projetos específicos. Com o NVM, você pode instalar, desinstalar e alternar entre diferentes versões do Node.js com facilidade, garantindo compatibilidade com diferentes projetos que podem exigir versões específicas.

1. Instalação do NVM
Para instalar o NVM, siga as instruções na [Documentação Oficial do NVM no GitHub](https://github.com/nvm-sh/nvm "Visite a Documentação Oficial")

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
2. Criar um novo diretório para o projeto:
Abra um terminal e crie um novo diretório para o seu projeto CDK em Java:

```hcl
mkdir meu-projeto-cdk-java

cd meu-projeto-cdk-java
```
3. Inicializar o Projeto CDK em Java:
Use o comando cdk init para inicializar um novo projeto CDK em Java. Isso criará uma estrutura básica para o seu projeto.

```hcl
cdk init app --language java
```
4. Abrir o Projeto no seu Editor de Código preferido:
Agora que o projeto foi criado, você pode abrir o diretório no seu editor de código preferido, como VSCode, IntelliJ IDEA, Eclipse, etc.

## Comandos para Criar os Recursos no AWS CDK definidos no código Java

- Comando para listar os recursos a serem provisionados:

```hcl
cdk list
```

- Comando para provisionar o recurso:

```hcl
cdk deploy nome-do-recurso
```

### Troubleshooting

Caso tenha o erro abaixo: 

```hcl
current credentials could not be used to assume 'arn:aws:iam::ACCOUNT_ID:role/cdk-hnb659fds-lookup-role-ACCOUNT_ID-us-east-1', but are for the right account. Proceeding anyway.

(To get rid of this warning, please upgrade to bootstrap version >= 8)

current credentials could not be used to assume 'arn:aws:iam::ACCOUNT_ID:role/cdk-hnb659fds-deploy-role-ACCOUNT_ID-us-east-1', but are for the right account. Proceeding anyway.

Vpc: deploying...

current credentials could not be used to assume 'arn:aws:iam::ACCOUNT_ID:role/cdk-hnb659fds-deploy-role-ACCOUNT_ID-us-east-1', but are for the right account. Proceeding anyway.


❌  Vpc failed: Error: Vpc: SSM parameter /cdk-bootstrap/hnb659fds/version not found. Has the environment been bootstrapped? Please run 'cdk bootstrap' (see https://docs.aws.amazon.com/cdk/latest/guide/bootstrapping.html)

    at CloudFormationDeployments.validateBootstrapStackVersion (/usr/local/lib/node_modules/aws-cdk/lib/api/cloudformation-deployments.ts:521:13)

    at processTicksAndRejections (internal/process/task_queues.js:97:5)

Vpc: SSM parameter /cdk-bootstrap/hnb659fds/version not found. Has the environment been bootstrapped? Please run 'cdk bootstrap' (see https://docs.aws.amazon.com/cdk/latest/guide/bootstrapping.html)
```

Este erro está relacionado ao processo de bootstrap do AWS CDK. O bootstrap é um pré-requisito para o deployment de aplicações usando o AWS Cloud Development Kit (CDK), pois ele prepara o ambiente AWS para o gerenciamento dos recursos criados pelo CDK. Especificamente, o erro indica que o parâmetro SSM (AWS Systems Manager Parameter Store) /cdk-bootstrap/hnb659fds/version não foi encontrado. Esse parâmetro é criado durante o processo de bootstrap e é usado pelo CDK para gerenciar versões e dependências.

Especificamente para este caso, faltou executar o comando **cdk bootstrap** antes do primeiro deployment na AWS. Esse comando só deve ser executado uma única vez por conta/região da AWS. Depois de executar esse comando, tente fazer o deployment dos recursos normalmente.

#### Passo a passo

1. Bootstrap do seu ambiente AWS com o AWS CDK
Execute o comando cdk bootstrap no terminal. Este comando irá configurar o ambiente na sua conta AWS para o uso com o CDK, criando os recursos necessários, como o parâmetro SSM mencionado no erro.

Se você estiver trabalhando com múltiplas contas ou regiões da AWS, precisará especificar a conta e a região como parte do comando de bootstrap. Por exemplo:

```hcl
cdk bootstrap aws://ACCOUNT_ID/REGION
```

Substitua ACCOUNT_ID pelo seu ID de conta AWS e REGION pela região que você deseja usar (por exemplo, us-east-1).

2. Verifique as permissões da sua conta AWS

O erro menciona também que as credenciais atuais não puderam ser usadas para assumir a role arn:aws:iam::303315406913:role/cdk-hnb659fds-deploy-role-303315406913-us-east-1, mesmo estando na conta correta. Isso sugere que pode haver um problema com as permissões associadas à sua conta ou à role que você está tentando assumir.

Verifique se a sua conta AWS tem permissão para assumir a role especificada e que essa role tem as políticas necessárias para realizar o deployment e o bootstrap do CDK.
Se você estiver usando uma conta específica para deployment, certifique-se de que as credenciais usadas para o AWS CLI ou para o SDK estão corretamente configuradas e têm permissões para realizar essas ações.

3. Execute o deployment novamente
Após realizar o bootstrap e verificar as permissões, tente executar o comando cdk deploy novamente para realizar o deployment do seu stack VPC.

Se o problema persistir, verifique se há atualizações disponíveis para o AWS CDK e considere atualizá-lo para a versão mais recente, pois problemas de compatibilidade ou bugs podem ocasionalmente ocorrer em versões específicas.

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













