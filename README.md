<h1>PHPSession</h1>
<ul>
    <li>Por Filipe Ramalho</li>
</ul> 
<h2>O que é</h2>
<p>
    Este código é uma interface entre o Java e as seções do php. Ele é útil para pegar informações de sessão armazenadas no php e retorná-las para uso dentro do código java.
    O formato dos dados retornados é em String JSON, e o tratamento desses dados caberá ao desenvolvedor.
 </p>
 <p>
    O intuito inicial para o desenvolvimento desse código foi o de criar uma interface java para interagir com o  <a href="https://github.com/ieducar/ieducar">i-Educar</a>, mas ele pode ser usado para outros fins.
 </p>
  
 <h2>
    Uso
 </h2>
 <p>
    Para usar o recurso você deve adicionar o arquivo PHPSession.java o seu código e o arquivo getSession.php ao "Root" do seu projeto.
 </p>
 <p>
 Requisitos:
 
 * Servidor php rodando na mesma máquina do código java
 * valor do cookie PHPSESSID gerado pelo php;
 * uma biblioteca para gerenciar JSONString
 
 Para retornar os dados da sessão, o desenvolvedor precisa apenas chamar o método estático da classe PHPSession passando como argumentos o PHPSESSID e, caso necessário o caminho do executável do php.
 </p>
 <p>
    Para saber se é necessário adicionar o caminho do executável do php, você deve digitar em seu terminal (bash ou cmd) o comando php -v. Se ocorrer algum erro ou não houver retorno da versão do php e o php estiver instalado, será necessário adicionar o caminho do executável do php como argumento. </P>