package com.zjgsu.bookserver;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books;
    private static int maxId = 0;

    BookRepository() {
        books = new ArrayList<>();
        initBooks();
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void deleteById(int id) {
        Book book = findById(id);
        if (book != null) {
            books.remove(book);
        }
    }

    public Book save(Book newBook) {
        if (newBook.getId() < 0) {
            newBook.setId(maxId++);
        }
        books.add(newBook);
        return newBook;
    }

    private void addBook(String title, String author, int pages, float price) {
        Book book = new Book(title, author, pages, price);
        save(book);
    }

    private void initBooks() {
        addBook("History of England, Foundation", "Ackroyd, Peter", 197, 4.36f);
        addBook("Artist and the Mathematician, The", "Aczel, Amir", 186, 12.88f);
        addBook("False Impressions", "Archer, Jeffery", 177, 6.27f);
        addBook("Prisoner of Birth, A", "Archer, Jeffery", 176, 6.6f);
        addBook("One", "Bach, Richard", 172, 8.96f);
        addBook("Mossad", "Baz-Zohar, Michael", 236, 4.06f);
        addBook("Complete Mastermind, The", "BBC", 178, 6.51f);
        addBook("Men of Mathematics", "Bell, E T", 217, 8.24f);
        addBook("Electric Universe", "Bodanis, David", 201, 7.6f);
        addBook("Learning OpenCV", "Bradsky, Gary", 232, 9.22f);
        addBook("To Sir With Love", "Braithwaite", 197, 6.3f);
        addBook("Angels & Demons", "Brown, Dan", 178, 6.7f);
        addBook("Angels & Demons", "Brown, Dan", 170, 6.45f);
        addBook("Outsider, The", "Camus, Albert", 198, 5.74f);
        addBook("Tao of Physics, The", "Capra, Fritjof", 179, 8.97f);
        addBook("Hidden Connections, The", "Capra, Fritjof", 197, 5.29f);
        addBook("Uncommon Wisdom", "Capra, Fritjof", 197, 7.56f);
        addBook("Machine Learning for Hackers", "Conway, Drew", 233, 13.84f);
        addBook("Jim Corbett Omnibus", "Corbett, Jim", 223, 4.25f);
        addBook("Introduction to Algorithms", "Cormen, Thomas", 234, 4.55f);
        addBook("Jurassic Park", "Crichton, Michael", 174, 5.26f);
        addBook("Last Mughal, The", "Dalrymple, William", 199, 12.5f);
        addBook("Beyond the Three Seas", "Dalrymple, William", 197, 10.46f);
        addBook("City of Djinns", "Dalrymple, William", 198, 8.28f);
        addBook("Oxford book of Modern Science Writing", "Dawkins, Richard", 240, 5.5f);
        addBook("Beautiful and the Damned, The", "Deb, Siddhartha", 198, 13.85f);
        addBook("Batatyachi Chal", "Deshpande P L", 200, 10.18f);
        addBook("Hafasavnuk", "Deshpande P L", 211, 8.41f);
        addBook("Urlasurla", "Deshpande P L", 211, 12.34f);
        addBook("Asami Asami", "Deshpande, P L", 205, 11.74f);
        addBook("Radiowaril Bhashane & Shrutika", "Deshpande, P L", 213, 5.04f);
        addBook("Gun Gayin Awadi", "Deshpande, P L", 212, 13.83f);
        addBook("Aghal Paghal", "Deshpande, P L", 212, 9.83f);
        addBook("Apulki", "Deshpande, P L", 211, 6.76f);
        addBook("Char Shabda", "Deshpande, P L", 214, 13.29f);
        addBook("Vyakti ani Valli", "Deshpande, P L", 211, 4.73f);
        addBook("Ahe Manohar Tari", "Deshpande, Sunita", 213, 4.51f);
        addBook("Numbers Behind Numb3rs, The", "Devlin, Keith", 202, 9.61f);
        addBook("Christmas Carol, A", "Dickens, Charles", 196, 12.73f);
        addBook("Ropemaker, The", "Dickinson, Peter", 196, 5.46f);
        addBook("Crime and Punishment", "Dostoevsky, Fyodor", 180, 10.71f);
        addBook("Idiot, The", "Dostoevsky, Fyodor", 197, 13.55f);
        addBook("Think Complexity", "Downey, Allen", 230, 10.24f);
        addBook("Complete Sherlock Holmes, The - Vol I", "Doyle, Arthur Conan", 176, 8.61f);
        addBook("Complete Sherlock Holmes, The - Vol II", "Doyle, Arthur Conan", 176, 10.3f);
        addBook("New Markets & Other Essays", "Drucker, Peter", 176, 12.89f);
        addBook("Age of Discontuinity, The", "Drucker, Peter", 178, 11.11f);
        addBook("Superfreakonomics", "Dubner, Stephen", 179, 8.02f);
        addBook("Freakonomics", "Dubner, Stephen", 197, 11.26f);
        addBook("Pattern Classification", "Duda, Hart", 241, 8.56f);
        addBook("Story of Philosophy, The", "Durant, Will", 170, 8.39f);
        addBook("Rosy is My Relative", "Durrell, Gerald", 176, 12.04f);
        addBook("Dylan on Dylan", "Dylan, Bob", 197, 5.55f);
        addBook("Image Processing with MATLAB", "Eddins, Steve", 241, 9.26f);
        addBook("Age of Wrath, The", "Eraly, Abraham", 238, 7.85f);
        addBook("Surely You're Joking Mr Feynman", "Feynman, Richard", 198, 4.37f);
        addBook("Great War for Civilization, The", "Fisk, Robert", 197, 13.57f);
        addBook("Age of the Warrior, The", "Fisk, Robert", 197, 9.83f);
        addBook("Pillars of the Earth, The", "Follett, Ken", 176, 13.97f);
        addBook("Data Smart", "Foreman, John", 235, 5.91f);
        addBook("Computer Vision, A Modern Approach", "Forsyth, David", 255, 10.06f);
        addBook("Veteran, The", "Forsyth, Frederick", 177, 4.52f);
        addBook("Phantom of Manhattan, The", "Forsyth, Frederick", 180, 10.26f);
        addBook("Deceiver, The", "Forsyth, Frederick", 178, 6.59f);
        addBook("Design with OpAmps", "Franco, Sergio", 240, 9.01f);
        addBook("From Beirut to Jerusalem", "Friedman, Thomas", 202, 4.31f);
        addBook("Case of the Lame Canary, The", "Gardner, Earle Stanley", 179, 8.91f);
        addBook("Maqta-e-Ghalib", "Garg, Sanjay", 221, 7.56f);
        addBook("Sea of Poppies", "Ghosh, Amitav", 197, 11.08f);
        addBook("Information, The", "Gleick, James", 233, 5.81f);
        addBook("Doctor in the Nude", "Gordon, Richard", 179, 6.56f);
        addBook("Doctor on the Brain", "Gordon, Richard", 204, 8.98f);
        addBook("Fundamentals of Wavelets", "Goswami, Jaideva", 228, 5.5f);
        addBook("Econometric Analysis", "Greene, W. H.", 242, 13.48f);
        addBook("Brethren, The", "Grisham, John", 174, 12.84f);
        addBook("Soft Computing & Intelligent Systems", "Gupta, Madan", 242, 8.91f);
        addBook("Raisin in the Sun, A", "Hansberry, Lorraine", 175, 10.39f);
        addBook("Free Will", "Harris, Sam", 203, 12.13f);
        addBook("God Created the Integers", "Hawking, Stephen", 197, 10.76f);
        addBook("Theory of Everything, The", "Hawking, Stephen", 217, 13.27f);
        addBook("Neural Networks", "Haykin, Simon", 240, 12.49f);
        addBook("Physics & Philosophy", "Heisenberg, Werner", 197, 12.49f);
        addBook("Catch 22", "Heller, Joseph", 178, 9.81f);
        addBook("Farewell to Arms, A", "Hemingway, Ernest", 179, 12.1f);
        addBook("Mein Kampf", "Hitler, Adolf", 212, 12.8f);
        addBook("Hunchback of Notre Dame, The", "Hugo, Victor", 175, 12.72f);
        addBook("Clash of Civilizations and Remaking of the World Order", "Huntington, Samuel", 228, 5.57f);
        addBook("Eyeless in Gaza", "Huxley, Aldous", 180, 9.93f);
        addBook("Talking Straight", "Iacoca, Lee", 175, 12.71f);
        addBook("Data Analysis with Open Source Tools", "Janert, Phillip", 230, 10.95f);
        addBook("Trial, The", "Kafka, Frank", 198, 9.23f);
        addBook("Manasa", "Kale, V P", 213, 9.65f);
        addBook("Let Us C", "Kanetkar, Yashwant", 213, 12.18f);
        addBook("Pointers in C", "Kanetkar, Yashwant", 213, 4.51f);
        addBook("Arthashastra, The", "Kautiyla", 214, 7.43f);
        addBook("How to Think Like Sherlock Holmes", "Konnikova, Maria", 240, 7.75f);
        addBook("O Jerusalem!", "Lapierre, Dominique", 217, 9.1f);
        addBook("City of Joy, The", "Lapierre, Dominique", 177, 6.67f);
        addBook("Freedom at Midnight", "Lapierre, Dominique", 167, 13.9f);
        addBook("Girl with the Dragon Tattoo", "Larsson, Steig", 179, 10.5f);
        addBook("Girl who kicked the Hornet's Nest", "Larsson, Steig", 179, 6.47f);
        addBook("Girl who played with Fire", "Larsson, Steig", 179, 8.3f);
        addBook("Prince, The", "Machiavelli", 173, 5.44f);
        addBook("Maugham's Collected Short Stories, Vol 3", "Maugham, William S", 171, 6.15f);
        addBook("Ashenden of The British Agent", "Maugham, William S", 160, 7.05f);
        addBook("Moon and Sixpence, The", "Maugham, William S", 180, 12.28f);
        addBook("Trembling of a Leaf, The", "Maugham, William S", 205, 9.36f);
        addBook("Python for Data Analysis", "McKinney, Wes", 233, 11.95f);
        addBook("Integration of the Indian States", "Menon, V P", 217, 11.55f);
        addBook("Drunkard's Walk, The", "Mlodinow, Leonard", 197, 9.04f);
        addBook("Power Electronics - Mohan", "Mohan, Ned", 237, 12.45f);
        addBook("Half A Life", "Naipaul, V S", 196, 10.79f);
        addBook("In a Free State", "Naipaul, V. S.", 196, 12.35f);
        addBook("India's Legal System", "Nariman", 177, 9.23f);
        addBook("Scoop!", "Nayar, Kuldip", 216, 9.89f);
        addBook("Discovery of India, The", "Nehru, Jawaharlal", 230, 11.18f);
        addBook("Data Mining Handbook", "Nisbet, Robert", 242, 8.51f);
        addBook("Making Software", "Oram, Andy", 232, 13.12f);
        addBook("Down and Out in Paris & London", "Orwell, George", 179, 12.59f);
        addBook("Animal Farm", "Orwell, George", 180, 12.59f);
        addBook("We the People", "Palkhivala", 216, 7.28f);
        addBook("We the Nation", "Palkhivala", 216, 13.86f);
        addBook("Last Lecture, The", "Pausch, Randy", 197, 8.46f);
        addBook("Zen & The Art of Motorcycle Maintenance", "Pirsig, Robert", 172, 10.81f);
        addBook("Tales of Mystery and Imagination", "Poe, Edgar Allen", 172, 10.47f);
        addBook("Statistical Decision Theory'", "Pratt, John", 236, 13.4f);
        addBook("Return of the Primitive", "Rand, Ayn", 202, 6.65f);
        addBook("We the Living", "Rand, Ayn", 178, 10.43f);
        addBook("Ayn Rand Answers", "Rand, Ayn", 203, 12.2f);
        addBook("Philosophy: Who Needs It", "Rand, Ayn", 171, 7.63f);
        addBook("Justice, Judiciary and Democracy", "Ranjan, Sudhanshu", 224, 6.12f);
        addBook("Power Electronics - Rashid", "Rashid, Muhammad", 235, 12.53f);
        addBook("Cathedral and the Bazaar, The", "Raymond, Eric", 217, 7.41f);
        addBook("Tales of Beedle the Bard", "Rowling, J K", 184, 10.99f);
        addBook("On Education", "Russell, Bertrand", 203, 8.7f);
        addBook("History of Western Philosophy", "Russell, Bertrand", 213, 8.4f);
        addBook("Unpopular Essays", "Russell, Bertrand", 198, 6.23f);
        addBook("Empire of the Mughal - The Tainted Throne", "Rutherford, Alex", 180, 8.03f);
        addBook("Empire of the Mughal - Brothers at War", "Rutherford, Alex", 180, 13.24f);
        addBook("Empire of the Mughal - Ruler of the World", "Rutherford, Alex", 180, 7.26f);
        addBook("Empire of the Mughal - The Serpent's Tooth", "Rutherford, Alex", 180, 8.13f);
        addBook("Empire of the Mughal - Raiders from the North", "Rutherford, Alex", 180, 11.41f);
        addBook("Broca's Brain", "Sagan, Carl", 174, 12.58f);
        addBook("Orientalism", "Said, Edward", 197, 10.73f);
        addBook("More Tears to Cry", "Sassoon, Jean", 235, 12.83f);
        addBook("Data Scientists at Work", "Sebastian Gutierrez", 230, 13.98f);
        addBook("Argumentative Indian, The", "Sen, Amartya", 209, 9.61f);
        addBook("Idea of Justice, The", "Sen, Amartya", 212, 10.85f);
        addBook("Identity & Violence", "Sen, Amartya", 219, 11.21f);
        addBook("Rationality & Freedom", "Sen, Amartya", 213, 7.97f);
        addBook("Image Processing & Mathematical Morphology", "Shih, Frank", 241, 6.36f);
        addBook("Signal and the Noise, The", "Silver, Nate", 233, 13.61f);
        addBook("Simpsons & Their Mathematical Secrets", "Singh, Simon", 233, 9.3f);
        addBook("Code Book, The", "Singh, Simon", 197, 11.41f);
        addBook("Wealth of Nations, The", "Smith, Adam", 175, 4.05f);
        addBook("Courtroom Genius, The", "Sorabjee", 217, 8.67f);
        addBook("Russian Journal, A", "Steinbeck, John", 196, 10.56f);
        addBook("Journal of a Novel", "Steinbeck, John", 196, 6.01f);
        addBook("Once There Was a War", "Steinbeck, John", 196, 5.44f);
        addBook("Moon is Down, The", "Steinbeck, John", 196, 4.37f);
        addBook("Winter of Our Discontent, The", "Steinbeck, John", 196, 5.14f);
        addBook("Burning Bright", "Steinbeck, John", 175, 12.32f);
        addBook("Life in Letters, A", "Steinbeck, John", 196, 5.54f);
        addBook("Grapes of Wrath, The", "Steinbeck, John", 196, 12.48f);
        addBook("Textbook of Economic Theory", "Stonier, Alfred", 242, 9.71f);
        addBook("Amulet of Samarkand, The", "Stroud, Jonathan", 179, 12.22f);
        addBook("Structure & Interpretation of Computer Programs", "Sussman, Gerald", 240, 4.46f);
        addBook("Data Structures Using C & C++", "Tanenbaum, Andrew", 235, 13.51f);
        addBook("Analysis, Vol I", "Tao, Terence", 248, 6.47f);
        addBook("Structure and Randomness", "Tao, Terence", 252, 10.2f);
        addBook("Principles of Communication Systems", "Taub, Schilling", 240, 6.55f);
        addBook("India from Midnight to Milennium", "Tharoor, Shashi", 198, 9.38f);
        addBook("Great Indian Novel, The", "Tharoor, Shashi", 198, 8.86f);
        addBook("Bookless in Baghdad", "Tharoor, Shashi", 206, 5.62f);
        addBook("Elements of Information Theory", "Thomas, Joy", 229, 12.89f);
        addBook("Nature of Statistical Learning Theory, The", "Vapnik, Vladimir", 230, 5.09f);
        addBook("Statistical Learning Theory", "Vapnik, Vladimir", 228, 7.72f);
        addBook("Social Choice & Welfare, Vol 39 No. 1", "Various", 235, 10.79f);
        addBook("20000 Leagues Under the Sea", "Verne, Jules", 190, 4.37f);
        addBook("Birth of a Theorem", "Villani, Cedric", 234, 13.81f);
        addBook("Slaughterhouse Five", "Vonnegut, Kurt", 198, 11.35f);
        addBook("Short History of the World, A", "Wells, H G", 197, 6.62f);
        addBook("New Machiavelli, The", "Wells, H. G.", 180, 5.59f);
        addBook("Devil's Advocate, The", "West, Morris", 178, 10.2f);
        addBook("All the President's Men", "Woodward, Bob", 177, 13.12f);
        addBook("Veil: Secret Wars of the CIA", "Woodward, Bob", 171, 12.8f);
        addBook("Dongri to Dubai", "Zaidi, Hussain", 216, 4.08f);
    }
}
