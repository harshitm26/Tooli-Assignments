auto iterate(int len) 
{
  for (int i = 0; i < len; ++i)
    if (search (i))
      return i;
  return -1;
}
