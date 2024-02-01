create table if not exists product(
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName VARCHAR,
    price DOUBLE
);

create table if not exists review(
    reviewId INT PRIMARY KEY AUTO_INCREMENT,
    reviewContent VARCHAR,
    rating INT,
    productId INT,
    FOREIGN KEY(productId) REFERENCES product(productId)
);