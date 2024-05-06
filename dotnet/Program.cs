var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.UseStaticFiles();
app.MapGet("/", () => "Bem-Vindo ao Hello World .Net Asp!");

app.Run();