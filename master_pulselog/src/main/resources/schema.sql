CREATE TABLE if not exists target (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    description TEXT,
    type VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    initial_value DECIMAL(19, 2),
    target_value DECIMAL(19, 2),
    create_dt TIMESTAMP,
    end_dt TIMESTAMP,
    start_dt TIMESTAMP
);

CREATE TABLE if not exists node_type (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title VARCHAR(255) NOT NULL,
    description TEXT,
    target_id UUID NOT NULL,
    FOREIGN KEY (target_id) REFERENCES Target(id) ON DELETE CASCADE
);

CREATE TABLE if not exists target_node (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    node_value DECIMAL(19, 2),
    node_type_id UUID NOT NULL,
    create_dt TIMESTAMP,
    target_id UUID NOT NULL,
    FOREIGN KEY (node_type_id) REFERENCES node_type(id),
    FOREIGN KEY (target_id) REFERENCES target(id) ON DELETE CASCADE
);