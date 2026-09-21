package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    void main() {
        Department obj = new Department(1, "Books");

        Seller seller1 = new Seller(21, "Bob", "bob@@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("====== TEST 1: SELLER findById ======");
        Seller seller2 = sellerDao.findByID(3);

        System.out.println(seller2);
    }
}