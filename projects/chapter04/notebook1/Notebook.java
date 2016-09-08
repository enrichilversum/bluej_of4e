import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 *
 * *
 * * EM: MY NOTES
 */
public class Notebook
{
    /*
     * * EM : Field / instance variable
     * * <Type> determines the type of data the arraylist stores
     */
    // Storage for an arbitrary number of notes.
    private ArrayList < String > notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     *
     * * EM:  constructor, new instance of ArrayList called 'notes'
     */
    public Notebook()
    {
        notes = new ArrayList < String >();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     *
     * * EM Methods, Arraylist method .add
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     * EM: Exc 4.16 Modified error message
     */
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0)
        {
            System.out.println(noteNumber+" is not a valid value");
        }
        else if(noteNumber < numberOfNotes())
        {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else
        {
            System.out.println(noteNumber+" is not a valid value");
        }
    }

    /** EM: experimetn :P (and later in 4.23)
     *  C type for loop
     */
    public void showAllNotes()
    {
        for(int i = 0; i < notes.size(); i++)
        {

            System.out.println("["+i+"] "+notes.get(i));
        }

    }

    /** EM: 4.8.1 
     * For-each loop (colon construct)
     * would coincide with the'`for i in ${var[@]}` bash loop 
     * 
     */
    public void listNotes()
    {
        for(String note : notes) {
            System.out.println(note);
        }

    }

    /** EM Ex. 4.4 silly get method
     * 
     */
    public void show5thElement()
    {
        System.out.println(notes.get(4));
    }

    /** EM: Ex. 4.9
     * 
     */
    public void removeNote(int noteNumber)
    {
        if ((noteNumber <= numberOfNotes())||(noteNumber < 0))
        {
            notes.remove(noteNumber);
        }
        else {
            System.out.println(noteNumber+" is not a valid value");
        }

    }

    /** EM: Ex. 4.20, 4.21, 4.23 zeGoogle() 
     * 
     */
    public void searchInNotes(String searchString) 
    {
        int index = 0;
        boolean found = false ;
        int lenght = notes.size(); 
        while(index < lenght && !found) {
            String note = notes.get(index);
            if(note.contains(searchString)) {
                found = true;
                System.out.println(searchString+" : idx"+index+"  "+note);
            }
            else {
                index++;
            }

        }

    }

    /** EM: 4.8.3  Iterator example
     * 
     */
    public void iterateThroughNotes()
    {
        Iterator<String> it = notes.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /** EM Exerc. 4.24
     * Remove given a string
     */
    public void removeNote(String searchString)
    {
        Iterator<String> it = notes.iterator();
        while(it.hasNext()) {
            String note = it.next();
            if (note.contains(searchString)) {
                it.remove();
            }
        }
    }
}
