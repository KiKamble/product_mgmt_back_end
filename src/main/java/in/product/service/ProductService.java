package in.product.service;

import java.util.List;

import in.product.model.Product;

public interface ProductService {
  public Product saveProduct(Product product);
  
  public List<Product> getallProducts();
  
  public Product getProductById(Integer id);
  
  public String deleteProduct(Integer id);
  
  public Product editProduct(Product product,Integer id);
}
