package com.crudfarmacia.crudfarmacia.responsity;


import com.crudfarmacia.crudfarmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public List<Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
