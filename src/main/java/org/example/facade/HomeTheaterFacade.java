package org.example.facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector, Lights lights)
    {
        this.amp= amp;
        this.dvd=dvd;
        this.projector=projector;
        this.lights=lights;
    }

    public void watchMovie()
    {
        System.out.println("Watch movie");
        amp.on();
        lights.dim();
        dvd.on();
        projector.on();
        dvd.play();
    }

    public void endMovie()
    {
        System.out.println("ending movie");
        amp.off();
        lights.bright();
        dvd.stop();
        projector.off();
        dvd.off();
    }

}
