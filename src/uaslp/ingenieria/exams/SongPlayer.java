package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;
import java.util.List;

public class SongPlayer {

    public void play(Song song, List<Instrumento> instrumentos) {

        Iterator<Nota> notas = song.getSongIterator();

        while (notas.hasNext()) {
            Nota nota = notas.next();

            for(Instrumento instrumento : instrumentos){
                instrumento.tocar(nota);
            }
        }

    }

}
