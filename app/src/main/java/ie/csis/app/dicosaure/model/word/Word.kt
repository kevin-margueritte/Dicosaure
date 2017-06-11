package  ie.csis.app.dicosaure.model.word

import java.io.Serializable
import java.sql.Date

/**
 * Eng : This class is a Word.
 *       This word contain all the information relative to the word.
 *       the note, the word, the image and the sound, the last date of consultation or the id of the dictionary.
 * Fr : Cette classe est un mot.
 *      Contient toutes les informations relatives au mot.
 *      Le mot, sa note, une image, un son, la derniere date de consultation ou l'id du dictionnaire.
 * Created by dineen on 15/06/2016.
 */
open class Word(idWord: String? = null, note : String? = null, image : ByteArray? = null, sound : ByteArray? = null, headword
: String? = null, dateView: Date? = null, idDictionary: String? = null) : Serializable {

    var idWord : String? = idWord
    var note : String? = note
    var image : ByteArray? = image
    var sound : ByteArray? = sound
    var headword : String? = headword
    var dateView : Date? = dateView
    var idDictionary : String? = idDictionary

    /**
     * Overide of the toString method. Display all information of a Word.
     * @return String : Display all information of a Word.
     */
    override fun toString(): String{
        return "Word(idWord=$idWord, " +
                "note=$note, " +
                "image=$image, " +
                "sound=$sound, " +
                "headword='$headword', " +
                "dateView=$dateView, " +
                "idDictionary=$idDictionary)"
    }

    /**
     * Check if the dictionary are the same with the names
     */
    override fun equals(other: Any?): Boolean {
        val word = other!! as Word
        return word.headword == this.headword && word.idDictionary == this.idDictionary
    }

//    fun getHeadword() : String {
//        return this.headword
//    }

}
