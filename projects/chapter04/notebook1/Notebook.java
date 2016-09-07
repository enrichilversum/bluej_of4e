import java.util.ArrayList;

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
     */
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0)
        {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes())
        {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else
        {
            // This is not a valid note number, so do nothing.
        }
    }

    /** EM: experimetn :P
     *
     */
    public void showAllNotes()
    {
        for(int i = 0; i < notes.size(); i++)
        {

            System.out.println("["+i+"] "+notes.get(i));
        }

    }

    /** EM Ex. 4.4 silly get method
     * 
     */
    public void show5thElement()
    {
        System.out.println(notes.get(4));
    }

    /** EM: experiment remove a note
     * 
     */
    public void removeNote(int noteNumber)
    {
        if ((noteNumber <= numberOfNotes())&&(noteNumber < 0))
        {
            notes.remove(noteNumber);
        }
        else {
            System.out.println(noteNumber+" is not a valid value");
        }

    }

}
