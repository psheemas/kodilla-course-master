package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Optional;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Test
    public void testProductDaoSimpleSave(){
        //Given
        Product product1 = new Product("Ciastka");

        //When
        productDao.save(product1);

        //Then
        int id = product1.getId();
        Optional<Product> readProduct = productDao.findById(id);
        Assert.assertTrue(readProduct.isPresent());

        //CleanUp
        productDao.deleteById(id);

    }

    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSimpleSave(){
        //Given
        Invoice invoice1 = new Invoice("16513658");

        //When
        invoiceDao.save(invoice1);

        //Then
        int id = invoice1.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        Assert.assertTrue(readInvoice.isPresent());

        //CleanUp
        invoiceDao.deleteById(id);
    }

    @Autowired
    private ItemDao itemDao;
    @Test
    public void testItemDaoSave(){
        //Given
        Product product1 = new Product("Ciastka");
        Product product2 = new Product("Herbatniki");

        Item item1 = new Item(new BigDecimal(20),10,new BigDecimal(200),product1);
        Item item2 = new Item(new BigDecimal(40),10,new BigDecimal(400),product2);

        product1.getItems().add(item1);
        product2.getItems().add(item2);

        item1.setProduct(product1);
        item2.setProduct(product2);

        //When
        productDao.save(product1);
        productDao.save(product2);

        int id1 = product1.getId();
        int id2 = product2.getId();

        //Then
        Assert.assertNotEquals(0,id1);
        Assert.assertNotEquals(0,id2);

        //CleanUp
        productDao.deleteById(id1);
        productDao.deleteById(id2);
    }
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Ciastka");
        Product product2 = new Product("Herbatniki");

        Invoice invoice1 = new Invoice("16131651635");

        Item item1 = new Item(new BigDecimal(20),10,new BigDecimal(200),product1);
        Item item2 = new Item(new BigDecimal(40),10,new BigDecimal(400),product2);

        product1.getItems().add(item1);
        product2.getItems().add(item2);

        invoice1.getItems().add(0,item1);
        invoice1.getItems().add(1,item2);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        item1.setProduct(product1);
        item2.setProduct(product2);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice1);
        itemDao.save(item1);
        itemDao.save(item2);

        int id = invoice1.getId();

        //Then
       Assert.assertNotEquals(2,id);

    }

}