package com.wb.negocio;

import java.util.List;

import com.wb.modelo.Produto;

public class ListarTodosProdutos extends Listagem {
  private List<Produto> produtos;

  public ListarTodosProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  @Override
  public void listar() {
    System.out.println("\nLista de todos os produtos:");

    if (this.produtos.size() == 0)
      System.out.println(" - Nenhum produto cadastrado");

    for (Produto produto : produtos) {
      System.out.println("Nome: " + produto.nome);
      System.out.println("Preco: " + produto.getPreco());

      System.out.println("--------------------------------------");
    }
  }
}
