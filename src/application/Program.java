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
        Seller seller2 = sellerDao.findByID(3);

        System.out.println("\n====== TESTE 2: seller findByDepartment ======");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj2 : list) {
            System.out.println(obj2);
        }
    }
}