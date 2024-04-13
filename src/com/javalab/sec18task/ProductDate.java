package com.javalab.sec18task;

public class ProductDate {

        private int productId;
        private String productName;
        private int productCategory;
        private int price;

        public ProductDate(int productId, String productName, int productCategory, int price) {
            this.productId = productId;
            this.productName = productName;
            this.productCategory = productCategory;
            this.price = price;
        }

        public ProductDate() {
        }

        // 게터 세터
        public int getProductId() {return productId;}

        public void setProductId(int productId) {this.productId = productId;}

        public String getProductName() {return productName;}

        public void setProductName(String productName) {this.productName = productName;}

        public int getProductCategory() {return productCategory;}

        public void setProductCategory(int productCategory) {this.productCategory = productCategory;}

        public int getPrice() {return price;}

        public void setPrice(int price) {this.price = price;}
    }

