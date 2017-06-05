package net.slipp.di;

public class MessageRender {
	
	public void render(){
		MessageProvider mp = new HelloWorldMessageProvider();
		System.out.println(mp.getMessage());
	}
	/*
	public void render(){
		MessageProvider mp = new HiWorldMessageProvider();
		System.out.println(mp.getMessage());
	}
	 */
	
	public static void main(String[] args) {
		MessageRender render = new MessageRender();
		render.render();
	}
	
}