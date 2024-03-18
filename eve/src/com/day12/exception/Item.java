package com.day12.exception;

public abstract class Item {
	public abstract void execute()throws DogExceptions;
}


class StickItem extends Item{
	@Override
	public void execute()throws DogExceptions {
		throw new DogBiteException("You Beat I Bite.....");
	}
}

class StoneItem extends Item{
	@Override
	public void execute()throws DogExceptions {
		throw new DogBarkException("You Throw I Bark.......");
	}
}

class BiscuitItem extends Item{
	@Override
	public void execute()throws DogExceptions {
		throw new DogHappyException("You Throw I enjoy..yummy,,yummy.......");
	}
}