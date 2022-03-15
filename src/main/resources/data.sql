DROP TABLE IF EXISTS pokemons;

CREATE TABLE pokemons (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  type VARCHAR(250) NOT NULL,
  attack VARCHAR(250) DEFAULT NULL
);

INSERT INTO pokemons (name, type, attack) VALUES
  ('Pikachu', 'Electric', 'Thunder'),
  ('Bulbasaur', 'Grass', 'Vine Whip'),
  ('Charizard', 'Flame', 'Blaze');
