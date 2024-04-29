# Hello World Python
![Toolbox](img/toolbox-playground.png)

## Uso local

Para usar o projeto Hello World Flask Python, siga estas etapas:

1. Certifique-se de ter a versão atual do Python (v3.9.7) instalada em sua máquina. Você pode baixar e instalar o Python a partir do site oficial: [https://www.python.org](https://www.python.org).

2. Abra o terminal ou prompt de comando e navegue até o diretório raiz do projeto.

3. Crie um ambiente virtual para isolar as dependências do projeto:
    ```bash
    python -m venv venv
    ```

4. Ative o ambiente virtual:
    - No Windows:
      ```bash
      venv\Scripts\activate
      ```
    - No macOS/Linux:
      ```bash
      source venv/bin/activate
      ```

5. Instale as dependências:
    ```bash
    pip install -r requirements.txt
    ```

6. Execute o projeto:
    ```bash
    python app.py
    ```

7. Abra seu navegador e visite `http://localhost:5000` para ver a mensagem "Bem-Vindo ao Hello World Flask Python".