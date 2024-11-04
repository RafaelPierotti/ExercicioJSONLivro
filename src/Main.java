import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String jsonBook = "{\"titulo\":\"Percy Jackon\",\"autor\":\"Rick Riordan\",\"editora\":{\"nome\":\"Intrinseca\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();

        Livro livro = gson.fromJson(jsonBook, Livro.class);

        System.out.println(livro);
    }
}