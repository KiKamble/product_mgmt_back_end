package in.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
