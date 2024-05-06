var builder = WebApplication.CreateBuilder(args); // Cria uma instância do WebApplicationBuilder usando os argumentos fornecidos

var app = builder.Build(); // Constrói a aplicação web com base na instância do WebApplicationBuilder

app.UseStaticFiles(); // Configura a aplicação para usar arquivos estáticos, como arquivos CSS, JavaScript e imagens

app.MapGet("/", () => "Bem-Vindo ao Hello World .Net Asp!"); // Mapeia a rota raiz ("/") para uma função anônima que retorna a mensagem "Bem-Vindo ao Hello World .Net Asp!"

app.Run(); // Executa a aplicação web