package semmieboy_yt.simulations.instances;

import semmieboy_yt.simulations.Simulation;

public class TestSimulation implements Simulation {
    @Override
    public String getName() {
        return "Test Simulation";
    }

    @Override
    public String getDescription() {
        return "This simulation is meant for testing only";
    }

    @Override
    public String init() {
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {

    }

    @Override
    public void stop() {

    }
}