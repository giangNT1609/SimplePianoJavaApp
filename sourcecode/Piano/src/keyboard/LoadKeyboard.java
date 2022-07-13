package keyboard;

import java.util.ArrayList;

public abstract class LoadKeyboard {
    int volume;
    ArrayList<Note> notes = new ArrayList<Note>();

    public Note getNoteC() {
        for(Note i : notes) {
            if (i.getTitle() == 60) {
                return i;
            }
        }
        return null;
    }
    public Note getNoteD() {
        for(Note i : notes) {
            if (i.getTitle() == 62) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteE() {
        for(Note i : notes) {
            if (i.getTitle() == 64) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteF() {
        for(Note i : notes) {
            if (i.getTitle() == 65) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteG() {
        for(Note i : notes) {
            if (i.getTitle() == 67) {
                return i;
            }
        }
        return null;
    }
    public Note getNoteA() {
        for(Note i : notes) {
            if (i.getTitle() == 69) {
                return i;
            }
        }
        return null;
    }
    public Note getNoteB() {
        for(Note i : notes) {
            if (i.getTitle() == 71) {
                return i;
            }
        }
        return null;
    }
    public Note getNoteCSharp() {
        for(Note i : notes) {
            if (i.getTitle() == 61) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteDSharp() {
        for(Note i : notes) {
            if (i.getTitle() == 63) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteFSharp() {
        for(Note i : notes) {
            if (i.getTitle() == 66) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteGSharp() {
        for(Note i : notes) {
            if (i.getTitle() == 68) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteASharp() {
        for(Note i : notes) {
            if (i.getTitle() == 70) {
                return i;
            }
        }
        return null;
    }
    public Note getNoteC1() {
        for(Note i : notes) {
            if (i.getTitle() == 72) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteD1() {
        for(Note i : notes) {
            if (i.getTitle() == 74) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteE1() {
        for(Note i : notes) {
            if (i.getTitle() == 76) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteF1() {
        for(Note i : notes) {
            if (i.getTitle() == 77) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteG1() {
        for(Note i : notes) {
            if (i.getTitle() == 79) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteA1() {
        for(Note i : notes) {
            if (i.getTitle() == 81) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteB1() {
        for(Note i : notes) {
            if (i.getTitle() == 83) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteCSharp1() {
        for(Note i : notes) {
            if (i.getTitle() == 73) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteDSharp1() {
        for(Note i : notes) {
            if (i.getTitle() == 75) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteFSharp1() {
        for(Note i : notes) {
            if (i.getTitle() == 78) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteGSharp1() {
        for(Note i : notes) {
            if (i.getTitle() == 80) {
                return i;
            }
        }
        return null;
    }

    public Note getNoteASharp1() {
        for(Note i : notes) {
            if (i.getTitle() == 82) {
                return i;
            }
        }
        return null;
    }
    public void setVolume(int volume) {
        for(Note i : notes) {
            i.setVolume(volume);
        }
    }
}