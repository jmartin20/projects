package commun;
import visidia.simulation.process.messages.Message;
import gui.Forme;

public class SyncMessage extends Message {

    MsgType type;
    int proc;
    int procTarget;
    Forme forme;
    int horloge;

    public SyncMessage() {}

    // Message REGISTER, TOKEN
    public SyncMessage( MsgType type, int proc) {
        this.type = type;
        this.proc = proc;
        this.procTarget = proc;
    }

    // Message END_REGISTER & REL
    public SyncMessage( MsgType type, int proc, int procTarget) {
        this.type = type;
        this.proc = proc;
        this.procTarget = procTarget;
    }

    // Message REQ
    public SyncMessage( MsgType type, int proc, int procTarget, int parameter) {
        this.type = type;
        this.proc = proc;
        this.procTarget = procTarget;
        this.horloge = parameter;
    }

    // Message FORME
    public SyncMessage( MsgType t, Forme forme, int initiateur, int procTarget) {
        type = t;
        this.forme = forme;
        this.procTarget = procTarget;
        this.proc = initiateur;
    }

    // Get Message Type
    public MsgType getMsgType() {

        return type;
    }

    // Get numero de processus
    public int getMsgProc() {

        return proc;
    }

    public int getMsgHorloge(){
        return horloge;
    }

    // Get numero du processus Target
    public int getMsgProcTarget() {
        return procTarget;
    }

    // Get la forme envoyée
    public Forme getMsgForme() {

        return forme;
    }

    @Override
    public Message clone() {
        return new SyncMessage();
    }

    @Override
    public String toString() {

        String r = type.toString() + "_" + proc;
        return r;
    }

    @Override
    public String getData() {

        return this.toString();
    }

}