package sjjg.designmode.facade;

import main.designmode.facade.DVDPlayer;
import main.designmode.facade.Popcorn;
import main.designmode.facade.Projector;
import main.designmode.facade.Screen;
import main.designmode.facade.Stereo;
import main.designmode.facade.TheaterLight;

public class HomeTheaterFacade {
	
	//定义各个子系统对象
	private main.designmode.facade.TheaterLight theaterLight;
	private main.designmode.facade.Popcorn popcorn;
	private main.designmode.facade.Stereo stereo;
	private main.designmode.facade.Projector projector;
	private main.designmode.facade.Screen screen;
	private main.designmode.facade.DVDPlayer dVDPlayer;
	
	
	//构造器
	public HomeTheaterFacade() {
		super();
		this.theaterLight = TheaterLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.stereo = Stereo.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.dVDPlayer = DVDPlayer.getInstanc();
	}

	//操作分成 4 步
	
	public void ready() {
		popcorn.on();
		popcorn.pop();
		screen.down();
		projector.on();
		stereo.on();
		dVDPlayer.on();
		theaterLight.dim();
	}
	
	public void play() {
		dVDPlayer.play();
	}
	
	public void pause() {
		dVDPlayer.pause();
	}
	
	public void end() {
		popcorn.off();
		theaterLight.bright();
		screen.up();
		projector.off();
		stereo.off();
		dVDPlayer.off();
	}


	
	
	
}
