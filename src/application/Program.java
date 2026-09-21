package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    void main() {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("====== TEST 1: SELLER findById ======");
        Seller seller = sellerDao.findByID(3);
        System.out.println(seller);

        System.out.println("\n====== TEST 2: seller findByDepartment ======");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n===== TEST 3: seller findAll =====");
        list = sellerDao.findAll();
        for (Seller obj2 : list) {
            System.out.println(obj2);
        }

        System.out.println("\n===== TEST 4: seller insert =====");
        Seller newSeller = new Seller(null, "Jeff", "jeff@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n===== TEST 5: seller update =====");
        seller = sellerDao.findByID(1);
        seller.setName("Messi");
        sellerDao.update(seller);
        System.out.println("Update completed");
    }
}