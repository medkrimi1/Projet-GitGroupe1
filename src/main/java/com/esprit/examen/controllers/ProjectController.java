package com.esprit.examen.controllers;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.entities.Operateur;
import com.esprit.examen.services.ICategorieProduitService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Api(tags = "Gestion des categories Produit")
@RequestMapping("/categorieProduit")
@RequiredArgsConstructor

public class ProjectController {
    //fatma : je suis entrain d'ajouter les fonctions de categorieProductController
    private final ICategorieProduitService categorieProduitService;

    @GetMapping
    public List<CategorieProduit> getCategorieProduit() {
        List<CategorieProduit> list = categorieProduitService.retrieveAllCategorieProduits();
        return list;
    }
<<<<<<< HEAD
//added by fatma 15/4/2023
    @GetMapping("/{categorieProduit-id}")
    public CategorieProduit retrieveCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
        return categorieProduitService.retrieveCategorieProduit(categorieProduitId);
    }
//added by mohamed
    @PostMapping
    public FournisseurRestController addFournisseur(@RequestBody FournisseurRestController f) {
        FournisseurRestController fournisseur =  FournisseurRestController().addFournisseur(f);
        return fournisseur;
    }
    // Added By Sarah Ar
    @PutMapping
    public Operateur modifyOperateur(@RequestBody Operateur operateur) {
        return operateur;
    }
    @PostMapping
    public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp) {
        CategorieProduit categorieProduit = categorieProduitService.addCategorieProduit(cp);
        return categorieProduit;
    }
    @DeleteMapping("{categorieProduit-id}")
    public void removeCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
        categorieProduitService.deleteCategorieProduit(categorieProduitId);
    }
    @PutMapping
    public CategorieProduit modifyCategorieProduitsss(@RequestBody CategorieProduit categorieProduit) {
        return categorieProduitService.updateCategorieProduit(categorieProduit);
    }


=======
    
>>>>>>> branch-Sarah

@PostMapping("/categorieProduit")
public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit categorieProduit) {
    return categorieProduitService.save(categorieProduit);
}

    
}
