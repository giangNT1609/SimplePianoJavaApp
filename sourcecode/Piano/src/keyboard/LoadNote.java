package keyboard;

import java.util.ArrayList;

public abstract class LoadNote {
    int volume;
    ArrayList<NewNote> notes = new ArrayList<NewNote>();

    public NewNote getNoteC() {
        for(NewNote i : notes) {
            if (i.getTitle() == 60) {
                return i;
            }
        }
        return null;
    }
    public NewNote getNoteD() {
        for(NewNote i : notes) {
            if (i.getTitle() == 62) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteE() {
        for(NewNote i : notes) {
            if (i.getTitle() == 64) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteF() {
        for(NewNote i : notes) {
            if (i.getTitle() == 65) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteG() {
        for(NewNote i : notes) {
            if (i.getTitle() == 67) {
                return i;
            }
        }
        return null;
    }
    public NewNote getNoteA() {
        for(NewNote i : notes) {
            if (i.getTitle() == 69) {
                return i;
            }
        }
        return null;
    }
    public NewNote getNoteB() {
        for(NewNote i : notes) {
            if (i.getTitle() == 71) {
                return i;
            }
        }
        return null;
    }
    public NewNote getNoteCSharp() {
        for(NewNote i : notes) {
            if (i.getTitle() == 61) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteDSharp() {
        for(NewNote i : notes) {
            if (i.getTitle() == 63) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteFSharp() {
        for(NewNote i : notes) {
            if (i.getTitle() == 66) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteGSharp() {
        for(NewNote i : notes) {
            if (i.getTitle() == 68) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteASharp() {
        for(NewNote i : notes) {
            if (i.getTitle() == 70) {
                return i;
            }
        }
        return null;
    }
    public NewNote getNoteC1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 72) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteD1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 74) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteE1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 76) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteF1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 77) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteG1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 79) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteA1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 81) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteB1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 83) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteCSharp1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 73) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteDSharp1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 75) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteFSharp1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 78) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteGSharp1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 80) {
                return i;
            }
        }
        return null;
    }

    public NewNote getNoteASharp1() {
        for(NewNote i : notes) {
            if (i.getTitle() == 82) {
                return i;
            }
        }
        return null;
    }
    public void setVolume(int volume) {
        for(NewNote i : notes) {
            i.setVolume(volume);
        }
    }
}