-- Kategoriler tablosu
CREATE TABLE Categories (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by INT,
    updated_by INT,
    deleted_by INT,
    deleted_at TIMESTAMP,
    version INT DEFAULT 1
);

-- Kullanıcılar tablosu
CREATE TABLE Users (
    id INT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    address VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by INT,
    updated_by INT,
    deleted_by INT,
    deleted_at TIMESTAMP,
    version INT DEFAULT 1
);

-- Ürünler tablosu
CREATE TABLE Products (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    stock_quantity INT NOT NULL,
    image_url VARCHAR(255),
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by INT,
    updated_by INT,
    deleted_by INT,
    deleted_at TIMESTAMP,
    version INT DEFAULT 1,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES Categories(id)
);

-- Sepetler tablosu
CREATE TABLE Carts (
    id INT PRIMARY KEY,
    user_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by INT,
    updated_by INT,
    deleted_by INT,
    deleted_at TIMESTAMP,
    version INT DEFAULT 1,
    FOREIGN KEY (user_id) REFERENCES Users(id)
);

-- Sepet öğeleri tablosu
CREATE TABLE Cart_Items (
    id INT PRIMARY KEY,
    cart_id INT,
    product_id INT,
    quantity INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by INT,
    updated_by INT,
    deleted_by INT,
    deleted_at TIMESTAMP,
    version INT DEFAULT 1,
    FOREIGN KEY (cart_id) REFERENCES Carts(id),
    FOREIGN KEY (product_id) REFERENCES Products(id)
);
