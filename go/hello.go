package main

import (
	"fmt"
	"net/http"
)

func handler(w http.ResponseWriter, r *http.Request) {
	http.ServeFile(w, r, "index.html")
	fmt.Println("Acesso à porta 8080 de:", r.RemoteAddr)
}

func main() {
	fmt.Println(" Now listening on: http://localhost:8080")
	http.HandleFunc("/", handler)
	http.Handle("/static/", http.StripPrefix("/static/", http.FileServer(http.Dir("static"))))
	http.ListenAndServe(":8080", nil)
}
