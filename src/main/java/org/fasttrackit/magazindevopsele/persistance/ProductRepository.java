package org.fasttrackit.magazindevopsele.persistance;

import org.fasttrackit.magazindevopsele.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
