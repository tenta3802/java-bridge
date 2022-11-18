package bridge;

import view.InputView;
import view.OutputView;

import java.util.List;

public class BridgeController {
    private BridgeRandomNumberGenerator bridgeRandomNumberGenerator;

    public void run() {
        new OutputView().printStart();
        makeBridgeController();
    }

    public void makeBridgeController() {
        int size = new InputView().readBridgeSize();
        List<String> bridge = new BridgeMaker(bridgeRandomNumberGenerator).makeBridge(size);
        System.out.println(bridge);
        int blockCount = bridge.size();
        moveController(bridge, blockCount);
    }

    public void moveController(List<String> bridge, int blockCount) {
        new BridgeGame().move(bridge, blockCount);
    }
}